package A2Z_Strivers_DSA.heaps.medium_question;
 class ListNode {
     int val;
      ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class Merg_k_Sorted_Lists {
    public static void main(String[] args) {

    }
    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length==0)return null;
        if (lists.length==1)return lists[0];
        ListNode head=null;
        int n=0;
        while(n< lists.length-1){
            ListNode pointer=null;
            ListNode first=lists[n];
            ListNode second=lists[n+1];
            if (first==null){
                n++;
                continue;
            }
            if (second==null){
                lists[n+1]=first;
                n++;
                continue;
            }

            while(first!=null&&second!=null){
                if (first.val<second.val){
                    if (pointer==null){
                        head=first;
                        pointer=first;
                    }else{
                        pointer.next=first;
                        pointer=pointer.next;
                    }
                    first=first.next;
                }
                else{
                    if (pointer==null){
                        head=second;
                        pointer=second;
                    }
                    else{
                        pointer.next=second;
                        pointer=pointer.next;
                    }
                    second=second.next;
                }
            }

            if (first!=null){
                pointer.next=first;
            }
            if (second!=null){
                pointer.next=second;
            }
            lists[n+1]=head;
            n++;

        }
        return head;

    }
}
