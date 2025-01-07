package Linklist;

import java.util.Scanner;

public class CLL {
    node3 head;
    node3 tail;
    int size;
    public void delete(int index){
        if (index==0){
            head=head.next;
            tail.next=head;
            size--;
            return;
        }
         else if (index==size){
            node3 temp=head;
            for (int i = 1; i <index-1; i++) {
                temp=temp.next;
            }
            temp.next=head;
            tail=temp;
            size--;
            return;
        } else if (index>size) {
            System.out.println("enter valid index");
            return;

        }
         node3 temp=head;
         node3 swap;
        for (int i = 1; i <index ; i++) {
            temp=temp.next;
        }
        swap=temp.next.next;
        temp.next=swap;
        size--;

    }
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
            head=ob;
            tail=head;
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
               if (temp==null){
                  return;
               }
               System.out.print(temp.data+" ->");
               temp=temp.next;
           }while (temp!=head);
        }
        System.out.println();
        System.out.println(size);
    }
    public void insertlast(int data){

        node3 ob=new node3(data);
        if (head==null){
            head=tail=ob;
            return;
        }
            tail.next=ob;
            tail=ob;
            tail.next=head;
    }
    class node3{
        int data;
        node3 next;
        node3(int dat){
           this.data=dat;
           this.next=null;
            size++;
        }
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        CLL list=new CLL();
//        list.insertlast(1);
//        list.insertlast(2);
//        list.insertlast(3);
//        list.insertlast(4);
//        list.insertfirst(10);
//        list.insertmiddle(18,1);
//        list.delete(6);
//        list.delete(2);
//        list.display();
        int n;
        while(true){
            System.out.println("which operation you have to perform" +
                    "\n 1. insertfirst    2.insertlast 3. insertmiddle" +
                    "\n 4.delete 5.exit ");
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
