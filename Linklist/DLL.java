package Linklist;

public class DLL {
    Node head;
    Node tail;
    public void insert(int data){
        Node ob=new Node(data);
        if (head==null){
            tail=head=ob;
            head.prev=null;
        }
        else{
            tail.next=ob;
            ob.prev=tail;
            tail=ob;

        }
    }

    public void insertfirst(int data){
        Node ob=new Node(data);
        if (head==null){
            insert(data);
            return;
        }
        ob.next=head;
        head.prev=ob;
        head=ob;
    }

    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    public void displayreverse(){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.prev;
        }
        System.out.println();
    }
    class Node{
        int value;
        Node next;
        Node prev;
        Node(int data){
            value=data;
        }
    }

    public static void main(String[] args) {
        DLL ob=new DLL();
        ob.insert(1);
        ob.insert(2);
        ob.insert(3);
        ob.insert(4);
        ob.insertfirst(10);
        ob.display();
//        ob.displayreverse();

    }
}
