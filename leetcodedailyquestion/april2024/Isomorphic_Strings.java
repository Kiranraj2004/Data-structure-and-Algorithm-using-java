package leetcodedailyquestion.april2024;

import java.util.HashMap;

public class Isomorphic_Strings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("add","eag"));
    }
    public static boolean isIsomorphic(String s, String t) {
//        HashMap<Character,Character>res=new HashMap<>();
//        for (int i = 0; i <s.length() ; i++) {
//            if ((res.containsKey(s.charAt(i)))){
//                if(t.charAt(i)!=res.get(s.charAt(i))){
//                    return false;
//                }
//            }
//            else{
//                if(res.containsValue(t.charAt(i)))return false;
//                res.put(s.charAt(i),t.charAt(i));
//            }
//        }
//     return true;

        int []s1=new int[127];
        int[]t1=new int[127];
        for (int i = 0; i <s.length() ; i++) {
            if(s1[s.charAt(i)]!=t1[t.charAt(i)]){
                return false;
            }
            s1[s.charAt(i)]=i+1;
            t1[t.charAt(i)]=i+1;
        }
        return true;
    }
}
