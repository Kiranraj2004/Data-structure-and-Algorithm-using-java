package Queues;

public class Custumqueues {
    private final int[]data;
    private static final int max_size=10;

    public Custumqueues(int size) {
        this.data=new int[size];
    }
    public Custumqueues() {
        this(max_size);
    }
    private int front=-1,rear=-1;
    void enque (int data){
//        if(front==this.data.length){
//            front=0;
//            this.data[front]=data;
//            rear=0;
//            return;
//        }
        if (isfull()){
            System.out.println("queue is full");

        } else if (front==-1) {
            front++;
            rear++;
            this.data[rear]=data;
        }
        else {
            rear++;
            this.data[rear]=data;
        }
    }
    int deque() throws Exceptionalclass {
        if (isempty()){
            throw new  Exceptionalclass ("empty String ");
        }
        return data[front++];
    }

    private boolean isempty() {
        return front==-1||front== data.length;
    }
    private boolean isfull() {
        return rear==data.length-1;
    }

}
