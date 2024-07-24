package leetcodedailyquestion.july2024;
import java.util.*;
public class Sort_Array_by_Increasing_Frequency {
    public static void main(String[] args) {

    }
     static class node{
        int freq;
        int num;
        node(int freq,int num){
            this.freq=freq;
            this.num=num;
        }
     }
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer>temp=new HashMap<>();
        for (int num : nums) {
            if (temp.containsKey(num)) {
                temp.put(num, temp.get(num) + 1);
            } else {
                temp.put(num, 1);
            }
        }
        PriorityQueue<node>res=new PriorityQueue<>((X, Y)->X.freq-Y.freq);
        for(int i:temp.keySet()){
            res.add(new node(temp.get(i),i));
        }
        int i=0;
        while(!res.isEmpty()){
            int  n=res.peek().freq;
            ArrayList<Integer>q=new ArrayList<>();
            while(!res.isEmpty()&&res.peek().freq==n){
                q.add(res.peek().num);
                res.remove();
            }
            if(q.size()>1){
                Collections.sort(q);
                Collections.reverse(q);
            }
            for(int j:q){
                for (int k = 1; k <=n ; k++) {
                    nums[i]=j;
                    i++;
                }
            }

        }
        return nums;
    }
}
