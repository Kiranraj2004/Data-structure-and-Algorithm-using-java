package A2Z_Strivers_DSA.Array.Medium;
import java.util.*;
public class Missing_And_Repeating {
    public static void main(String[] args) {
    }
     public ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n=arr.length;
        int []hash=new int[n+1];
        for(int i:arr){
            hash[i]++;
        }
        int repeat=0,missing=0;
        for(int i=1;i<n+1;i++){
            if(hash[i]==2)repeat=i;
            if(hash[i]==0)missing=i;
        }
        ArrayList<Integer>res=new ArrayList<>();
        res.add(repeat);
        res.add(missing);
        return res;
    }
   public  ArrayList<Integer> findTwoElement1(int []arr) {
        long n=arr.length;
        long sn=((long) n *(n+1))/2;
        long sn2=(n*(n+1)*(2L * n +1))/6;
        long s=0;
        long s2=0;
        for(int i:arr){
            s+=i;
            s2+=((long) i *i);
        }
        long val1=s-sn;
        long val2=s2-sn2;


        val2=val2/val1;
        long x=(val1+val2)/2;
        long y=x-val1;

       ArrayList<Integer>res=new ArrayList<>();
       res.add((int)x);
       res.add((int)y);
       return res;
    }
}
