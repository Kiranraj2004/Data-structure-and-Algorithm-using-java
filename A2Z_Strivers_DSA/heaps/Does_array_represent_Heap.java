package A2Z_Strivers_DSA.heaps;

public class Does_array_represent_Heap {
    public static void main(String[] args) {

    }
    public boolean countSub(long arr[], long n)
    {
        // Your code goes here
        for(long i=n-1;i>0;i--){
            long p=parent(i);
            if(arr[(int)p]<arr[(int)i]){
                return false;
            }
        }
        return true;

    }
    public long parent(long i){
        return (i-1)/2;
    }
}
