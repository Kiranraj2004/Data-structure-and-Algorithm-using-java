package Leetcodecontest.may_5_2024;

public class Valid_Word {
    public static void main(String[] args) {
        String s="123A#s";
        System.out.println(isValid(s));
    }
    public  static boolean isValid(String word) {
        if (word.length()<3)return false;
        int v=0;
        int c=0;
        String temp="AEIOUaeiou";
        for (int i = 0; i <word.length() ; i++) {
            if (((int)word.charAt(i))>=45&&((int)word.charAt(i))<=57){
                continue;
            }
            else if (Character.isAlphabetic(word.charAt(i))){
                if (temp.indexOf(word.charAt(i))==-1){
                    c++;
                }
                else{
                    v++;
                }
            }
            else{
                return false;
            }
        }
        if (v>=1&&c>=1){
            return true;
        }
        return false;

    }

}
