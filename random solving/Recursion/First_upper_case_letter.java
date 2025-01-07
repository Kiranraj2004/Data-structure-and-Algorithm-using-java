package Recursion;

public class First_upper_case_letter {
    public static void main(String[] args) {
        String str="geeKs";
        System.out.println(capital(str,0));
    }
    static char capital(String str,int i){
        if (i==str.length())return ' ';
        if (Character.isUpperCase(str.charAt(i))){
            return str.charAt(i);
        }
        else return capital(str,i+1);
    }
}
