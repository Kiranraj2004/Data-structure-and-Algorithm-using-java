package A2Z_Strivers_DSA.Linklist;

import java.util.HashSet;

public class Find_length_of_Loop {
    public static void main(String[] args) {

    }
    public static int lengthOfLoop(Node head) {
        // Write your code brute force method
//        HashSet<Node>res=new HashSet<>();
//        Node temp=head;
//        while(temp!=null){
//            if (res.contains(temp)){
//                Node entry=temp;
//                int count=0;
//                do{
//                    count++;
//                    temp=temp.next;
//                }while(temp!=entry);
//                return count;
//            }
//            res.add(temp);
//            temp=temp.next;
//        }
//        return 0;
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                int count =0;
                do{
                    count++;
                    fast=fast.next;
                }while(fast!=slow);
                return count;
            }
        }
        return 0;
    }
}
