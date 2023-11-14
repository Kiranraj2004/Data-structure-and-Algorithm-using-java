package String;
import java.util.ArrayList;
import java.util.Arrays;
// this is a geeksforgeeks weekly contest problem
public class Geeks_for_geeks {
    public static void main(String[] args) {
        String[]s={"abcdghw","aaa","ksks"};
        System.out.println(Arrays.toString(prime(s)));
    }
    static int[]prime(String[] s){
        int[]ans=new int[s.length];
        for (int i = 0; i <s.length ; i++) {
            int num=0;
            ArrayList<Character>w=new ArrayList<>();
            for (int j = 0; j <s[i].length(); j+=2) {
                if (!w.contains(s[i].charAt(j))){
                    num++;
                    w.add(s[i].charAt(j));
                }
            }
           ans[i]= !primenumber(num)?0:1;

        }

        return ans;
    }

    private static boolean primenumber(int num) {
        if (num==1)return false;
        for (int i = 2; i <num ; i++) {
            if (num%i==0){
                return false;
            }
        }
        return true;
    }

}
