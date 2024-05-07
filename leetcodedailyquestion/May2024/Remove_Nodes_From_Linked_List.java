package leetcodedailyquestion.May2024;

import java.util.List;
import java.util.Stack;

class ListNode{
    int val;
    ListNode next;
    ListNode(int data){
        val=data;
        next=null;
    }
}

public class Remove_Nodes_From_Linked_List {
    public static void main(String[] args) {

    }
    public  static ListNode removeNodes(ListNode head) {
        if (head.next==null)return head;
        Stack<ListNode> res=new Stack<>();
        ListNode temp=null;
        helper( head,res);
        while (!res.isEmpty()){
            if (temp==null){
                head=res.pop();
                temp=head;
            }else{
                temp.next=res.pop();
                temp=temp.next;
            }
        }
        if(temp!=null)
           temp.next=null;
        return head;
    }
    public static void helper(ListNode temp,Stack<ListNode>res){
        if (temp==null){
            return;
        }
        helper(temp.next,res);
        if (res.isEmpty()){
            res.add(temp);
        }else{
            if (res.peek().val<=temp.val){
                res.add(temp);
            }
        }
    }
}
