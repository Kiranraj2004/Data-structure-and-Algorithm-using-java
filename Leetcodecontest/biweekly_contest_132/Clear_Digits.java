package Leetcodecontest.biweekly_contest_132;
//08/062024
public class Clear_Digits {
    public static void main(String[] args) {
        System.out.println(clearDigits("ab12"));
    }
    public static  String clearDigits(String s) {
        StringBuffer res=new StringBuffer();
        for (int i = 0; i <s.length() ; i++) {
            if (Character.isDigit(s.charAt(i))){
                res.deleteCharAt(res.length()-1);
            }
            else{
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}
