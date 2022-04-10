package Arrays.tutort.assignment.three;

//https://leetcode.com/problems/reverse-vowels-of-a-string/
public class Star_ReverseVowelsInString {

    public static void main(String[] args) {
        String res=reverseVowels("aeiou");
        System.out.println(res);
    }

    private static boolean isVowel(char c){
        return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A'|| c=='E' || c=='I' ||c=='O' || c=='U' );
    }

    public static String reverseVowels(String s) {
        if(s.trim().equals("")) return s;
        if(s.length()==1) return s;
        char[] ch = s.trim().toCharArray();
        int i = 0;
        int j = ch.length - 1;
        while (i <= j) {
            while (i< ch.length && !isVowel(ch[i])) {
                i++;
            }
            while (j>=0 && !isVowel(ch[j])) {
                j--;
            }
            if(i>=j){
                break;
            }
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(ch);
    }

}


