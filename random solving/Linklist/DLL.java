package Linklist;

import java.util.Scanner;

public class DLL {
    Node head;
    Node tail;
    int size;
    public void delete(int index){
        if (index==0){
            head=head.next;
            head.prev=null;
            size--;
            return;
        }
        if (index==size){
            tail= tail.prev;
            tail.next=null;
            size--;
            return;
        }
        Node temp=head,nextnode;
        for (int i = 1; i <index ; i++) {
            temp=temp.next;
        }
        nextnode=temp.next.next;
        temp.next=nextnode;
        nextnode.prev=temp;
        size--;
    }
    public void  insertmiddle(int data,int index){
        if (index==0){
            insertfirst(data);
            return;
        } else if (index==size) {
            insert(data);
            return;
        }
        else if (index>size){
            System.out.println("please enter valid index");
            return;
        }
        Node temp,nextnode;
        Node ob=new Node(data);
        temp=head;
        for (int i = 1; i <index ; i++) {
            temp=temp.next;
        }
        nextnode=temp.next;
        temp.next=ob;
        ob.prev=temp;
        ob.next=nextnode;
        nextnode.prev=ob;
        size++;
    }
    public void insert(int data){
        Node ob=new Node(data);
        if (head==null){
            tail=head=ob;
            head.prev=null;
            size++;
        }
        else{
            tail.next=ob;
            ob.prev=tail;
            tail=ob;
            size++;

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
        size++;
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
        DLL list=new DLL();
        Scanner input=new Scanner(System.in);
//        ob.insert(1);
//        ob.insert(2);
//        ob.insert(3);
//        ob.insert(4);
//        ob.insertfirst(10);
//        ob.insertmiddle(8,0);
//        ob.delete(2);
//        ob.display();
//        ob.displayreverse();

        int n;
        while(true){
            System.out.println("which operation you have to perform" +
                    "\n 1. insertfirst    2.insertlast 3. insertmiddle" +
                    "\n 4.delete  5.reverse list ");
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
                    list.insert(data);
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
                case 5 ->{
                 list.displayreverse();
                }
            }
            if (n>5){
                System.out.println("thanks for playing");
                break;
            }
        }

    }
}
