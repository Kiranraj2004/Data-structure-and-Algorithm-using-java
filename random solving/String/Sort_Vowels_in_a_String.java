package String;
//https://leetcode.com/problems/sort-vowels-in-a-string/submissions/
import java.util.Arrays;

public class Sort_Vowels_in_a_String {
    public static void main(String[] args) {
        String s="lEetcOde";
        System.out.println(sortVowels(s));

    }

//     public static String sortVowels(String s) {
//        char []res=s.toCharArray();
//        for (int i = 0; i <res.length; i++) {
//            if (!isvowels(res[i])){
//                continue;
//            }
//            for (int j = i; j < res.length; j++) {
//                if (!isvowels(res[j])||j==i){
//                    continue;
//                }
//                int first=(int)res[i];
//                int second=(int)res[j];
//                if (first >second){
//                    char temp=res[i];
//                    res[i]=res[j];
//                    res[j]=temp;
//                }
//            }
//
//        }
//
//         return String.valueOf(res);
//    }
    public static boolean isvowels(char a){
        String str = "aeiouAEIOU";
        return str.indexOf(a) != -1;
    }
    public  static String sortVowels(String s) {
        StringBuilder tem= new StringBuilder();
        for (int i = 0; i <s.length() ; i++) {
            if (isvowels(s.charAt(i))){
              tem.append(s.charAt(i));
            }
        }
         String temp=tem.toString();
       char[] t=temp.toCharArray();
        Arrays.sort(t);
        int i=0;
        char[]res=new char[s.length()];
        for (int j = 0; j <s.length(); j++) {
            if (isvowels(s.charAt(j))){
               res[j]=t[i++];
            }
            else {
                res[j]=s.charAt(j);
            }
        }
       return String.valueOf(res);
    }

}
