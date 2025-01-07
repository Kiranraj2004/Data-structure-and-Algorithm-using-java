package Linklist;

public class reverse_of_CLL {
    node4 head;
    node4 tail;
    public void reverse(){
        node4 prev,current,nextnode;
        prev=tail;
        current=nextnode=head;
       do {
           nextnode=nextnode.next;
           current.next=prev;
           prev=current;
           current=nextnode;
       }while (nextnode!=head);
       head=prev;
    }
    public void insert(int data){
        node4 ob=new node4(data);
        if (head==null){
            head=tail=ob;
            return;
        }
        tail.next=ob;
        tail=ob;
        tail.next=head;
    }
    public void display(){
        node4 temp=head;
        if (head!=null){
            do{
                if (temp==null){
                    return;
                }
                System.out.print(temp.data+" ->");
                temp=temp.next;
            }while (temp!=head);
        }
        System.out.println();
    }
    public class node4{
        int data;
        node4 next;
        node4(int dat){
            this.data=dat;

        }
    }

    public static void main(String[] args) {
        reverse_of_CLL list=new reverse_of_CLL();
        list.insert(2);
        list.insert(3);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.display();
        list.reverse();
        list.display();
    }
}
