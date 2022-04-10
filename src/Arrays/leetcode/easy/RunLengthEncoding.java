package Arrays.leetcode.easy;

public class RunLengthEncoding {

    private void runLengthEncoding(){
        String s="AAABBCAB";
        StringBuilder sb = new StringBuilder();
        char[] c= s.toCharArray();
        int count=0;
        for(int i=0;i<c.length;i++){
            while(i<c.length-1 && c[i]==c[i+1]){
                count++;
                i++;
            }
            sb.append(c[i]);
            sb.append(count+1);
            count=0;
        }
        System.out.println(sb.toString());
    }

}
