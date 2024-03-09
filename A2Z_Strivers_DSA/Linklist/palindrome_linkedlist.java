package A2Z_Strivers_DSA.Linklist;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Stack;

public class palindrome_linkedlist {
    public static void main(String[] args) {

    }
    public static boolean checkpalindrome(Node head){
//        brute force method O(n)Tc O(n)sc
        Node temp=head;
        ArrayList<Integer>res=new ArrayList<>();
        while(temp!=null){
            res.add(temp.data);
            temp=temp.next;
        }
        int start=0;
        int end= res.size()-1;
        while(start<end){
            if (!Objects.equals(res.get(start), res.get(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;
//        ListNode slow=head;
//        ListNode fast=head;
//        while(fast!=null&&fast.next!=null){
//            slow=slow.next;
//            fast=fast.next.next;
//        }
//        ListNode prev=null;
//        while(slow!=null){
//            ListNode current=slow;
//            slow=slow.next;
//            current.next=prev;
//            prev=current;
//        }
//        ListNode start=head;
//        while(start!=null&&prev!=null){
//            if (start.val!=prev.val){
//                return false;
//            }
//            start=start.next;
//            prev=prev.next;
//        }
//        return false;
    }
}
