package Recursion;

public class Recursive_Programs_to_find_Minimum_and_Maximum_elements_of_array {
    public static void main(String[] args) {
        int []arr = {1, 4, 3, -5, -4, 8, 6};
        findMinandMax(arr);
    }
    public static void  findMinandMax(int A[] )
    {
        helper(A,0,A[0],A[0]);
    }
    public static void helper(int[] a,int i ,int min,int max){
        if (i==a.length){
            System.out.println("minimum in array "+min+ "   maximum in array  :"+max);
            return;
        }
        if (a[i]>max){
            helper(a,i+1,min,a[i]);
        }
        else if (a[i]<min){
            helper(a,i+1,a[i],max);
        }
        else
        helper(a,i+1,min,max);
    }
}

