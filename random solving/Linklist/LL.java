package Linklist;

import java.util.Scanner;

public class LL {
    node head;
    node tail;
    int size;
    node index(int index){
        node temp=head;
        for (int i = 1; i <index-1; i++) {
            temp=temp.next;
        }
     return temp;
    }
    public void delete(int index){
        if (index==1){
            head=head.next;
            size--;
            return;
        }
        else if(index==size){
            node temp=index(index);
            temp.next=null;
            tail=temp;
            size--;
            return;
        }
        node temp=index(index);
        node swap=temp.next;
        temp.next=swap.next;
      size--;

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
        System.out.println("\n"+size);
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
        Scanner input =new Scanner(System.in);
        LL list=new LL();
//        list.insertfirst(3);
//        list.insertfirst(9);
//        list.insertlast(9);
//        list.insertlast(2);
////        list.insertmiddle(10,);
//        list.delete(3);
//        list.display();

        int n;
        while(true){
            System.out.println("which operation you have to perform" +
                    "\n 1. insertfirst    2.insertlast 3. insertmiddle" +
                    "\n 4.delete  ");
            n=input.nextInt();


            switch (n) {
                case 1 -> {
                    System.out.println("enter data : ");
                    int data = input.nextInt();
                    list.insertfirst(data);
                    list.display();
                }
                case 2 -> {
                    System.out.println("enter data : ");
                    int data = input.nextInt();
                    list.insertlast(data);
                    list.display();
                }
                case 3-> {
                    System.out.println("enter data : ");
                    int data = input.nextInt();
                    System.out.println("enter index : ");
                    int index=input.nextInt();
                    list.insertmiddle(data,index);
                    list.display();
                }
                case 4 -> {
                    System.out.println("enter index : ");
                    int index=input.nextInt();
                    list.delete(index);
                    list.display();
                }
            }
            if (n>4){
                System.out.println("thanks for playing");
                break;
            }
        }
    }
}
