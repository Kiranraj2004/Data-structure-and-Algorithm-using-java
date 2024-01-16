//https://leetcode.com/problems/search-insert-position/
public class Search_insert_position {
    public static void main(String[] args) {
        int[]num={0,1,3,5,7,9};
        int target=7;
        System.out.println(search(num,target));
    }
    public static int search(int[]num,int target){
    int start=0,end=num.length-1,mid=0;
    while (start<=end){
        mid= start+end/2;
        if (num[mid]==target){
            return mid;
        }
        if (num[mid]>target){
      end=mid-1;
        }
        else
            start=mid+1;

    }
    return start;
    }
}
