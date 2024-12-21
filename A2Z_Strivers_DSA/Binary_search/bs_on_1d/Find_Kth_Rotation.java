package A2Z_Strivers_DSA.Binary_search.bs_on_1d;
import java.util.*;
public class Find_Kth_Rotation {
    public static void main(String[] args) {
        ArrayList<Integer>a=new ArrayList<>();
        a.add(5);a.add(1);a.add(2);a.add(3);a.add(4);
        System.out.println(findKRotation(a));





    }
    public static int findKRotation(List<Integer> arr) {
        // Code here
        int start=0;
        int end=arr.size()-1;
        int min=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr.get(start)<=arr.get(mid)){
                if(arr.get(start)<arr.get(min)){
                    min=start;
                }
                start=mid+1;
            }
            else{
                if(arr.get(mid)<arr.get(min)){
                    min=mid;
                }
                end=mid-1;;
            }
        }
        return min;
    }
}
