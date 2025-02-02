package A2Z_Strivers_DSA.string.medium;

import java.util.HashMap;

public class Roman_to_Integer {
    public static void main(String[] args) {

    }
    public int romanToInt(String s) {

        HashMap<Character,Integer>map=new HashMap<>();
        map.put('I',1);
        map.put('V', 5);
        map.put('X',10);
        map.put('L',50);
        map.put('C' ,100);
        map.put('D' ,500);
        map.put('M',1000);
        int ans=map.get(s.charAt(0));
        for (int i = 1; i <s.length() ; i++) {
            int previous=map.get(s.charAt(i-1));
            int current=map.get(s.charAt(i));
            if(current<=previous){
                ans+=current;
            }
            else{
                ans+=(current-previous);
            }
        }
        return ans;

    }

}
