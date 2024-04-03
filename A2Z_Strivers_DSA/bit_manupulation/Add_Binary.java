package A2Z_Strivers_DSA.bit_manupulation;

public class Add_Binary {
    public static void main(String[] args) {
        System.out.println(addBinary("11","1"));

    }
    public  static String addBinary(String a, String b) {
       StringBuffer res=new StringBuffer();
       int a1=a.length()-1;
       int b1=b.length()-1;
       int carry=0;
       while(a1>=0||b1>=0||carry!=0){
           if(a1>=0){
              carry+=(a.charAt(a1)-48);
              a1--;
           }
           if(b1>=0){
               carry+=(b.charAt(b1)-48);
               b1--;
           }
           res.append((char)(carry%2+48));
           carry/=2;
       }
       return res.reverse().toString();
    }
}
