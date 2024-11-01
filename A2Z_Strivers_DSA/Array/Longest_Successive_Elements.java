package A2Z_Strivers_DSA.Array;
import java.util.*;
public class Longest_Successive_Elements {
    public static void main(String[] args) {
        int []a={
                15 ,6 ,6,6,6,6,6,6,6,2, 1, 16, 4, 2, 29, 9, 12, 7, 5, 14, 21, 7, 12, 17, 16, 6, 26, 3
        };
        System.out.println(longestSuccessiveElements(a));
    }


//     brute force method
    public static int longestSuccessiveElements(int []a) {
        // Write your code here.
        Arrays.sort(a);
        int count=1;
        int i=0;
        for (int j = 1; j < a.length; j++) {
            if(a[j]-a[j-1]>1){
                i=j;
            }
            if(a[j]-a[j-1]==0){
                i++;
            }

            count=Math.max(count,(j-i)+1);
        }
        return count;
    }
//     which take  SC (1) TC(N**2)

//     optimal solution
    public static int longestSuccessiveElements1(int []a) {
        // Write your code here.
        HashSet<Integer> map=new HashSet<>();
        for (int i : a) {
            map.add(i);
        }
        int count=0;
        for (int i:a){
            int j=0;
            if(!map.contains(i-1)){
                while(map.contains(i+j)){
                    j++;
                }
                count=Math.max(count,j);

            }
        }
        return count;
    }
    //     which take  SC (n) TC(2N)
}
