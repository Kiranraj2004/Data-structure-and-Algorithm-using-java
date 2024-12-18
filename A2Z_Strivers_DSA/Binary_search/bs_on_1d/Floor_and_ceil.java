package A2Z_Strivers_DSA.Binary_search.bs_on_1d;

import java.util.Arrays;

public class Floor_and_ceil {
    public static void main(String[] args) {
        int []a={3,4,4,7,8,10};
        System.out.println(Arrays.toString(getFloorAndCeil(a,a.length,8)));

    }
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        // Wriute your code here.
        int []ans=new int[2];
        int f=floor(a,x);
        ans[0]=f==-1?-1:a[f];
        int c=ceil(a, x);
        ans[1]=c==n?-1:a[c];
        return ans;
    }
    public static int floor(int[]a,int x){
        int s=0;
        int e=a.length-1;
        while(s<=e){
            int mid=(e+s)/2;
            if(a[mid]==x){
                return mid;
            }
            else if(a[mid]>x)e=mid-1;
            else s=mid+1;
        }
        return e;
    }

    public static int ceil(int[]a,int x){
        int s=0;
        int e=a.length-1;
        while(s<=e){
            int mid=e-(e-s)/2;
            if(a[mid]==x){
                return mid;
            }
            else if(a[mid]>x)e=mid-1;
            else s=mid+1;
        }
        return s;
    }
}
