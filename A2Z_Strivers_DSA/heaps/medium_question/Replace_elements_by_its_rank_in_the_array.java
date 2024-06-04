package A2Z_Strivers_DSA.heaps.medium_question;

import java.util.*;

public class Replace_elements_by_its_rank_in_the_array {
    public static void main(String[] args) {
        int []arr={20, 15, 26, 2, 98, 6};
        System.out.println(Arrays.toString(arr));
        replaceWithRank(arr,arr.length);
        System.out.println(Arrays.toString(arr));

    }
    static int[] replaceWithRank(int arr[], int N) {
        // code here
//        PriorityQueue<Integer>res=new PriorityQueue<>();
        ArrayList<Integer>res=new ArrayList<>();

        for(int i:arr){
            if (!res.contains(i))
                res.add(i);
        }
        Collections.sort(res);
        HashMap<Integer,Integer>temp=new HashMap<>();
        int n=1;
       for(int i:res){
           temp.put(i,n);
           n++;
       }
        for (int i = 0; i <arr.length ; i++) {
            int get=temp.get(arr[i]);
            arr[i]=get;
        }
        return arr;
    }
}
