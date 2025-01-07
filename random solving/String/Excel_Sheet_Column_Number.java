package String;
//https://leetcode.com/problems/excel-sheet-column-number/
public class Excel_Sheet_Column_Number {
    public static void main(String[] args) {
        String s="AB";
        System.out.println(titleToNumber(s));

    }
    public  static int titleToNumber(String s) {
        int result = 0;
        for(int i = 0 ; i < s.length(); i++) {
            result = result * 26 + (s.charAt(i) - 'A' + 1);
        }
        return result;
    }
}
