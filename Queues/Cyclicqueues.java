package Queues;

public class Cyclicqueues {
   private  final int[]data;

    public Cyclicqueues(int size) {
        this.data = new int[size];
    }
    private  int rear=-1;
    private int front =0;
   private int count=0;

    void insert(int data){
        if (isfull()){
            System.out.println("queues is full");
        } else if (front==-1) {
            front++;
            this.data[++rear]=data;
            count++;
        }
        else{
            this.data[++rear%this.data.length]=data;
            count++;
        }

    }
    int delete() throws Exception{
        if (isempty()){
            throw new Exception("empty queues");
        }
        count--;
        return this.data[front++%this.data.length];
    }

    private boolean isempty() {
        return count==0;
    }

    private boolean isfull() {
        return count==this.data.length;
    }

}
