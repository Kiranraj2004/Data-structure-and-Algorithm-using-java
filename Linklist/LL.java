package Linklist;
public class LL {
    node head;
    node tail;
    public void insertfirst(int data){
        node ob=new node(data);
        ob.next=head;
        head=ob;
        if(tail==null){
            tail=head;
        }

    }
    public void display(){
        node temp=head;
        while(temp!=null){
            System.out.println(temp.data +" ");
            temp=temp.next;
        }
    }
 public   class node {
       int data;
       node next;

       public node(int data){
           this.data=data;
       }


   }
}
