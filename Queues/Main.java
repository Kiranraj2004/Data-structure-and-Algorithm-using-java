package Queues;

public class Main  {
    public static void main(String[] args) throws Exception {
        Custumqueues a=new Custumqueues(2);
//        a.deque();
//        System.out.println(a.deque());
        a.enque(1);
       a.enque(2);

        System.out.println(a.deque());
        System.out.println(a.deque());
//        System.out.println(a.deque());
        a.enque(13);
    }
}
