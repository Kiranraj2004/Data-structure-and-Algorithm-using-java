package A2Z_Strivers_DSA.Linklist;
import java.util.*;
public class Linked_List_Cycle {
    public static void main(String[] args) {

    }
//    this is using tortoise and hare algorithm
//    https://takeuforward.org/data-structure/detect-a-cycle-in-a-linked-list/
//O(n)time complexity and
//    //    o(1)space complexity  in  worst case
    public boolean hasCycle(Node head) {
        if(head==null)return false;
        Node fast=head;
        Node slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)return true;
        }
        return false;
    }
//    this is using brute force method which uses O(n)time complexity and
//    o(n)space complexity  in  worst case
    public boolean hasCyclea(Node head) {
        HashSet<Node>res=new HashSet<>();
        while(head!=null){
            if(res.contains(head)){
                return true;
            }
            res.add(head);
            head=head.next;
        }
        return false;
    }

}
