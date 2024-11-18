package A2Z_Strivers_DSA.Array.Medium;

import java.util.*;

public class Count_the_number_of_subarrays_having_a_given_XOR {
    public static void main(String[] args) {

    }

//    brute force method
    public long subarrayXor(int []arr, int m) {
        // code here
        long count=0;
        for (int i = 0; i <arr.length ; i++) {
            int xor=0;
            for (int j = i+1; j <arr.length ; j++) {
                xor^=arr[j];
                if(xor==m)count++;
            }

        }
        return  count;
    }
    public long subarrayXor1(int []arr, int m) {
        // code here
        long count=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        int xor=0;
        map.put(0,1);
        for (int i = 0; i <arr.length ; i++) {
            xor^=arr[i];
            int requiredxor=m^xor;
                if(map.containsKey(requiredxor))count+=map.get(requiredxor);
            if (map.containsKey(xor)) {
                map.put(xor, map.get(xor) + 1);
            } else {
                map.put(xor, 1);
            }
        }
        return  count;
    }
}
