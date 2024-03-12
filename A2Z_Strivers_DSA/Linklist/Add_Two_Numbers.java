package A2Z_Strivers_DSA.Linklist;

import java.util.LinkedList;

public class Add_Two_Numbers {
    public static void main(String[] args) {

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       int i=0;
       int number1=0;
       ListNode temp1=l1;
       while(temp1!=null){
           number1=temp1.val*Math.pow(10,i++)+number1;
           temp1=temp1.next;
       }
       int j=0;
        ListNode temp2=l1;
        int number2=0;
        while(temp2!=null){
            number2=temp2.val*Math.pow(10,j++)+number2;
            temp2=temp2.next;
        }
       ListNode temp=null;
        int original=number1+number2;
        while(original!=0){
            int reminder=original%10;
                ListNode n=new ListNode(reminder);
                if (temp==null){
                    temp=n;
                    l1=n;
                }
                else {
                    temp.next=n;
                    temp=n;
                }
            original/=10;
        }
        return l1;
    }
}
