package Linklist;

public class Reverse_of_list {
    node1 head;
    node1 tail;
    public void insert(int data){
        node1 list=new node1(data);

        if (head==null){
            tail=head=list;
        }
        else{
            tail.next=list;
            tail=list;

        }
    }

    public void reverse(){
        node1 prev,currentnode,nextnode;
        prev=null;
        currentnode=nextnode=head;
        while(nextnode!=null){
            nextnode=nextnode.next;
            currentnode.next=prev;
            prev=currentnode;
            currentnode=nextnode;
        }
        head=prev;
    }

    public void display(){
        node1 temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-> ");
            temp=temp.next;
        }
        System.out.println();
    }
   static class node1{
        int data;
        node1 next;
        node1(int data1){
           data=data1;
        }
    }

    public static void main(String[] args) {
        Reverse_of_list n=new Reverse_of_list();
        n.insert(1);
        n.insert(2);
        n.insert(3);
        n.insert(4);
        n.insert(5);
        n.display();
        n.reverse();
        n.display();
    }
}
