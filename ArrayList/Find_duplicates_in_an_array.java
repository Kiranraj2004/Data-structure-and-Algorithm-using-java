package ArrayList;

import java.util.*;



public class Find_duplicates_in_an_array {
    public static void main(String[] args) {
        int[]arr={0,1,2,3,2};
        System.out.println(duplicates(arr,arr.length));
    }
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        HashSet<Integer>temp=new HashSet<>();
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
           if(temp.contains(arr[i])){
               if (!res.contains(arr[i])){
                   res.add(arr[i]);
               }
           }
           else{
               temp.add(arr[i]);
           }
        }
        if (res.isEmpty()){
            res.add(-1);
            return res ;
        }
        Collections.sort(res);
        return res;
    }
}
