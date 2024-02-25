package Leetcodecontest;

public class mincostofkey {
    public static void main(String[] args) {
    String words="abcde";
        System.out.println(minimumPushes(words));
    }
    public  static int minimumPushes(String word) {
//        ArrayList<> k2=new ArrayList<String>( List.of());
        StringBuffer k2=new StringBuffer("afg");
        StringBuffer k3=new StringBuffer("bhi");
        StringBuffer k4=new StringBuffer("cjk");
        StringBuffer k5=new StringBuffer("dlm");
        StringBuffer k6=new StringBuffer("eno");
        StringBuffer k7=new StringBuffer("pqrs");
        StringBuffer k8=new StringBuffer("tuv");
        StringBuffer k9=new StringBuffer("wxyz");
        int sum=0;
        for (int i = 0; i < word.length() ; i++) {
            if ( k2.indexOf(String.valueOf(word.charAt(i)))!=-1){
                sum=sum+( (k2.indexOf(String.valueOf(word.charAt(i))))+1);
            } else if (k3.indexOf(String.valueOf(word.charAt(i)))!=-1) {
                sum=sum+( k3.indexOf(String.valueOf(word.charAt(i)))+1);
            }
            else if (k4.indexOf(String.valueOf(word.charAt(i)))!=-1) {
                sum=sum+( k4.indexOf(String.valueOf(word.charAt(i)))+1);
            }
            else if (k5.indexOf(String.valueOf(word.charAt(i)))!=-1) {
                sum=sum+( k5.indexOf(String.valueOf(word.charAt(i)))+1);
            }
            else if (k6.indexOf(String.valueOf(word.charAt(i)))!=-1) {
                sum=sum+( k6.indexOf(String.valueOf(word.charAt(i)))+1);
            }
            else if (k7.indexOf(String.valueOf(word.charAt(i)))!=-1) {
                sum=sum+( k7.indexOf(String.valueOf(word.charAt(i)))+1);
            }
            else if (k8.indexOf(String.valueOf(word.charAt(i)))!=-1) {
                sum=sum+( k8.indexOf(String.valueOf(word.charAt(i)))+1);
            }
            else if (k9.indexOf(String.valueOf(word.charAt(i)))!=-1) {
                sum=sum+( k9.indexOf(String.valueOf(word.charAt(i)))+1);
            }
        }

        return sum;
    }
}
