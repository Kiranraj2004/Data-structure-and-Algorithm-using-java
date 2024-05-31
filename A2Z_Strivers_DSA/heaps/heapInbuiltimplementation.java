package A2Z_Strivers_DSA.heaps;
import java.util.*;
public class heapInbuiltimplementation {
    public static void main(String[] args) {
//        maxheap
        System.out.println(extractMax());
        PriorityQueue<Integer>s=new PriorityQueue<>();
        s.add(1);
        s.add(6);
        s.add(3);
        s.add(4);
        s.add(5);
//        System.out.println(s.poll());
//        System.out.println(s.poll());
        Iterator<Integer>r=s.iterator();
        while (r.hasNext()){
            System.out.println(s.poll());
        }


        PriorityQueue<Integer>a=new PriorityQueue<>(Collections.reverseOrder());
        a.add(134);
        a.add(53);
        a.add(400);
        System.out.println(a.poll());
        a.isEmpty();

    }
     static  int extractMax() {
        // your code here
        PriorityQueue<Integer>a=new PriorityQueue<>(Collections.reverseOrder());
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            int x=input.nextInt();
            a.add(x);
        }
        if(a.isEmpty()){
            return 0;
        }
        return a.poll();
    }
}
