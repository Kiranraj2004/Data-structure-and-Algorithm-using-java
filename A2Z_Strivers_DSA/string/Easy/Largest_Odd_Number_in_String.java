package A2Z_Strivers_DSA.string.Easy;

public class Largest_Odd_Number_in_String {
    public static void main(String[] args) {

    }
    public String largestOddNumber(String num) {
        int index=num.length()-1;
        while(index>=0){
            int nums=(int)num.charAt(index)-'0';
            if((nums&1)==0)index--;
            else break;
        }
        if(index<0)return "";
        return num.substring(0,index+1);
    }
}
