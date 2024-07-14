package Leetcodecontest.weeklycontest_406;

import java.util.HashSet;

public class Delete_Nodes_From_Linked_List_Present_in_Array {
    public static void main(String[] args) {

    }
    static class ListNode{
        int val;
        ListNode next;
    }
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer>temp=new HashSet<>();
        for(int i:nums){
            temp.add(i);
        }
        ListNode head1=movehead(temp,head);
        ListNode prev=head1;
        ListNode currentndode;
        while(prev!=null){
            currentndode=prev.next;
            while(currentndode!=null&&temp.contains(currentndode.val)){
                currentndode=currentndode.next;
            }
            prev.next=currentndode;
            prev=currentndode;
        }
        return head1;
    }

    private ListNode movehead(HashSet<Integer> temp, ListNode head) {
        while(temp.contains(head.val)){
            head=head.next;
        }
        return head;
    }
}
