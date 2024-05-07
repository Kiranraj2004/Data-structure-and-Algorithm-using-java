package leetcodedailyquestion.May2024;

import java.util.List;
import java.util.Stack;

public class Double_a_Number_Represented_as_a_Linked_List {
    static ListNode head=null;
    public static void main(String[] args) {
        int []arr={9,9,9};
        ListNode p=null;
        for (int i = 0; i <arr.length ; i++) {
            ListNode t=new ListNode(arr[i]);
            if (head==null){
                head=t;
                p=head;
            }
            else{
                p.next=t;
                p=t;
            }
        }

       p= doubleIt(head);
        while(p!=null){
            System.out.print(p.val);
            p=p.next;
        }

    }

//    time complexity O(2N) space complexity O(N)

    public  static  ListNode doubleIt(ListNode head) {
//        int carry=0;
//        ListNode temp=head;
//        Stack<ListNode>s=new Stack<>();
//        while(temp!=null){
//            s.add(temp);
//            temp=temp.next;
//        }
//        while(!s.isEmpty()){
//          int value=s.peek().val;
//          value=(value*2)+carry;
//          int rem=value%10;
//          s.peek().val=rem;
//          s.pop();
//          carry=value/10;
//        }
//        while (carry!=0){
//            ListNode a=new ListNode(carry%10);
//            a.next=head;
//            head=a;
//            carry/=10;
//        }

        int carry=helper(head);
        while (carry!=0){
            ListNode a=new ListNode(carry%10);
            a.next=head;
            head=a;
            carry/=10;
        }
        return head;
    }

    private static int helper(ListNode temp) {
        if (temp==null){
            return 0;
        }
         int f= helper(temp.next);
        int value=temp.val;
        value=(value*2)+f;
          int rem=value%10;
          temp.val=rem;
          f=value/10;
          return f;
    }
}
