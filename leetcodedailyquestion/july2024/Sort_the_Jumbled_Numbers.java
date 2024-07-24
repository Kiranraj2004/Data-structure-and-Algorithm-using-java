package leetcodedailyquestion.july2024;
import java.util.*;
public class Sort_the_Jumbled_Numbers {
    public static void main(String[] args) {
        Sort_the_Jumbled_Numbers solution = new Sort_the_Jumbled_Numbers();

        int[] mapping1 = {8, 9, 4, 0, 2, 1, 3, 5, 7, 6};
        int[] nums1 = {991, 338, 38};
        System.out.println(Arrays.toString(solution.sortJumbled(mapping1, nums1)));

        System.out.println(solution.mappedValue(38,mapping1));

    }
    private int mappedValue(int num, int[] mapping) {
        if(num==0){
            return mapping[0];
        }
       int ans=0;
       Stack<Integer>temp=new Stack<>();
       while(num!=0){
           int rem=num%10;
           temp.add(mapping[rem]);
           num/=10;
       }
       while(!temp.isEmpty()&&temp.peek()==0){
           temp.pop();
       }
       while(!temp.isEmpty()){
           ans=(ans*10)+ temp.pop();
       }
       return ans;
    }


    public int[] sortJumbled(int[] mapping, int[] nums) {
        List<int[]> mappedNums = new ArrayList<>();
        for (int num : nums) {
            mappedNums.add(new int[]{num, mappedValue(num, mapping)});
        }
        Collections.sort(mappedNums, Comparator.comparingInt(a -> a[1]));

        int[] sortedNums = new int[nums.length];
        for (int i = 0; i < mappedNums.size(); i++) {
            sortedNums[i] = mappedNums.get(i)[0];
        }

        return sortedNums;
    }

}
