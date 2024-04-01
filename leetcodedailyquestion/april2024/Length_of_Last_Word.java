package leetcodedailyquestion.april2024;

public class Length_of_Last_Word {
    public static void main(String[] args) {
        String s="kiran";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        int length=0;
        for (int i = s.length()-1; i >=0 ; i--) {
            if(s.charAt(i)!=' '){
                while (i>=0&&s.charAt(i)!=' '){
                    length++;
                    i--;
                }
                return length;
            }
        }
     return length;
    }
}
