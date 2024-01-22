package A_LeetCode_75;

public class Greatest_Common_Divisor_of_Strings {
    public static void main(String[] args) {
        String str1="TAUXXTAUXXTAUXXTAUXXTAUXX";
        String str2="TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";
        System.out.println(gcdOfStrings(str1,str2));
    }
    public static String gcdOfStrings(String str1, String str2) {
//        StringBuilder temp1= new StringBuilder();
//        StringBuilder temp2= new StringBuilder();
//        long num1=0;
//        long num2=0;
//        for (int i = 0; i <str1.length() ; i++) {
//            if (temp1.indexOf(String.valueOf(str1.charAt(i)))==-1){
//                temp1.append(str1.charAt(i));
//            }
//            num1=num1+(str1.charAt(i)-64);
//        }
//        for (int i = 0; i <str2.length() ; i++) {
//            if (temp2.toString().indexOf(str2.charAt(i))==-1){
//                temp2.append(str2.charAt(i));
//            }
//            num2=num2+(str2.charAt(i)-64);
//        }
//
//        if (temp1.toString().equals(temp2.toString())) {
//           return temp2.toString();
//       }
//




//        this solution is using hfc
        if (!((str1 + str2).equals(str2 + str1))){
            return "";
        }
        int hcf=highestcommanfactor(str1.length(),str2.length());
    return str1.substring(0,hcf);
    }
    static int highestcommanfactor(int a,int b){
        int min=Math.min(a,b);
        while (true){
            if (a%min==0&&b%min==0){
                return min;
            }
            min--;
        }
    }

}
