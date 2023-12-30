package Queues;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Inbuiltqueues {
    public static void main(String[] args) {
//        queues is an interface
//        the is no queues class so that we cant create
//   the queues as the reference object
        Queue<Integer>n= new LinkedList<>();
        n.add(3);
        n.add(14);
        n.add(1);
        n.add(15);
        n.add(7);
        System.out.println(n.remove());
        System.out.println(n.offer(2));
//        this is a double ended queue we can add at any side and delete on bith side
        Deque<Integer> b=new ArrayDeque<>();
        b.poll();
//        this is how we create queues of type array using arraydeque this much faster
//        then linked list
        Queue<Integer>u=new ArrayDeque<>();


    }
}
