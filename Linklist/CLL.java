package Linklist;

public class CLL {
    node3 head;
    node3 tail;
    int size;
    public void insertmiddle(int data,int index){
        if (index==0){
            insertfirst(data);
            return;
        } else if (index==size) {
            insertlast(data);
            return;
        } else if (index>size) {
            System.out.println("enter the valid index");
            return;
        }
        node3 ob=new node3(data);
        node3 temp=head;
        for (int i = 1; i <index; i++) {
            temp=temp.next;
        }
        node3 swap=temp.next;
        temp.next=ob;
        ob.next=swap;

    }
    public void insertfirst(int data){
        node3 ob=new node3(data);
        if (head==null){
            insertlast(data);
            return;
        }
        ob.next=head;
        tail.next=ob;
        head=ob;
    }
    public void display(){
        node3 temp=head;
        if (head!=null){
           do{
               System.out.print(temp.data+" ->");
               temp=temp.next;
           }while (temp!=head);
        }
        System.out.println();
    }
    public void insertlast(int data){
        node3 ob=new node3(data);
        if (head==null){
            head=tail=ob;
        } else {
            tail.next=ob;
            tail=ob;
            tail.next=head;
        }

    }

    class node3{
        int data;
        node3 next;
        node3(int dat){
            data=dat;
            size++;
        }
    }

    public static void main(String[] args) {
        CLL list=new CLL();
        list.insertlast(1);
        list.insertlast(2);
        list.insertlast(3);
        list.insertlast(4);
        list.insertfirst(10);
        list.insertmiddle(18,1);
        list.display();


    }

}
