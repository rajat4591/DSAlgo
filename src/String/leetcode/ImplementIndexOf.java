package String.leetcode;

public class ImplementIndexOf {

    public static void main(String[] args) {
        int res= indexOf("aaaaa","bba");
        System.out.println(res);
    }

    public static int indexOf(String haystack, String needle) {
        if(needle.equals("")) return 0;
        int startIndex=-1;
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){ ///* Look for first character. */
                startIndex=i;
                int j=0;
                int foundAt=startIndex;
                /* Found first character, now look at the rest of needle */
                while(j<needle.length() && startIndex<haystack.length()){
                    if(haystack.charAt(startIndex)==needle.charAt(j)){
                        startIndex++;
                        j++;
                    } else{
                        break;
                    }
                }
                if(j==needle.length()){
                    return foundAt;
                }
            }
        }
        //needle not found
        return -1;
    }
}
