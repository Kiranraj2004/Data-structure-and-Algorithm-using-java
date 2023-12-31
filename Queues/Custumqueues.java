package Queues;

public class Custumqueues {
    private int[]data;
    private static final int max_size=10;

    public Custumqueues(int size) {
        this.data=new int[size];
    }
    public Custumqueues() {
        this(max_size);
    }
    private int front=-1,rear=-1;
    void enque (int data){
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
    int deque() throws Exception {
        if (isempty()){
            throw new Exception("the queue is empty");
        }
        return data[front++];
    }

    private boolean isempty() {
        return front==data.length-1;
    }

    private boolean isfull() {
        return rear==data.length-1;
    }

}
