package Queues;

public class Cyclicmain {
    public static void main(String[] args) throws Exception {
        Cyclicqueues a=new Cyclicqueues(3);
        a.insert(12);
        a.insert(12);
        a.insert(23);
        System.out.println(a.delete());
        a.insert(12);
        System.out.println(a.delete());
        System.out.println(a.delete());
        System.out.println(a.delete());


    }
}
