package Linklist;
public class LL {
    node head;
    node tail;
    int size;
//    node index(){
//
//    }
    public void delete(int index){
        if (index==0){
            head=head.next;
            size--;
        }
        else if(index==size){
//            node temp=index();

        }

    }
    public void insertlast(int data){
        node ob=new node(data);
        if (head==null){
            head=tail=ob;
        }
        else{
            tail.next=ob;
            tail=ob;
        }
        size++;

    }

    public void insertmiddle(int data,int index){
        if (index==0){
            insertfirst(data);
            return;
        }
        else if (index==size) {
            insertlast(data);
            return;
        }
        else if(index>size){
            System.out.println("enter index is out of bound");
            return;
        }
        node temp=head;
        for (int i = 1; i <index ; i++) {
            temp=temp.next;
        }
        node ob=new node(data);
        node swap=temp.next;
        temp.next=ob;
        ob.next=swap;
        size++;

    }
    public void insertfirst(int data){
        node ob=new node(data);
        ob.next=head;
        head=ob;
        if(tail==null){
            tail=head;
        }
    size++;
    }
    public void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data +" ->");
            temp=temp.next;
        }
//        System.out.println("\n"+size);
    }
 public   class node {
       int data;
       node next;

       public node(int data){
           this.data=data;
           this.next=null;
       }
   }
    public static void main(String[] args) {
        LL list=new LL();
        list.insertfirst(3);
        list.insertfirst(9);
        list.insertlast(9);
        list.insertlast(2);
        list.insertmiddle(10,10);
        list.display();
    }
}
