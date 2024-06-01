package A2Z_Strivers_DSA.heaps;

public class Convert_Min_Heap_to_Max_Heap {
    public static void main(String[] args) {

    }
    static void convertMinToMaxHeap(int N, int arr[]) {
        // code here
        for (int i = arr.length-1; i >0 ; i--) {
            while(arr[i]>arr[(i-1)/2]){
                upsort(arr,i);
            }
        }
    }
    static void upsort(int arr[],int i){
        if (i==0){
            return;
        }
        int parent=(i-1)/2;
        if (arr[parent]<arr[i]){
            int temp=arr[parent];
            arr[parent]=arr[i];
            arr[i]=temp;
            upsort(arr,parent);
        }
    }
}
