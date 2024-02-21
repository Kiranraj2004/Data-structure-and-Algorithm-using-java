package A2Z_Strivers_DSA.stacksandqueues;
class node {
    public int data;
    public node next;

    node()
    {
        this.data = 0;
        this.next = null;
    }

    node(int data)
    {
        this.data = data;
        this.next = null;
    }

    node(int data, node next)
    {
        this.data = data;
        this.next = next;
    }
};

class Queue{
    node front;
    node rear;
    void push(){};
    Queue() {
        front = null;
        rear = null;
    }
}
public class implement_queue_iusing_linkedlist extends Queue{
    public static void main(String[] args) {
          implement_queue_iusing_linkedlist obj=new implement_queue_iusing_linkedlist();
          obj.push(1);
        System.out.println(obj.pop());
    }
    public void push(int x) {
        // Write Your Code Here
        if (rear==null){
            node currentnode=new node(x);
            rear=front=currentnode;
            return;
        }
        node currentnode=new node(x);
        rear.next=currentnode;
        rear=currentnode;
    }

    public int pop() {
        // Write Your Code Here
        if (front==null)return -1;
        int data= front.data;
        front=front.next;
        return data;

    }
}
