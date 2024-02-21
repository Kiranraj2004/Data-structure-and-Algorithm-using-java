package A2Z_Strivers_DSA.stacksandqueues;
class Node
{
    int data;
    node next;
    Node()
    {
        this.data = 0;
        this.next = null;
    }
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
    Node(int data, node next)
    {
        this.data = data;
        this.next = next;
    }
};
public class Stack_With_Linked_List {
    public static void main(String[] args) {
         Stack_With_Linked_List obj=new Stack_With_Linked_List();
         obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        System.out.println(obj.getTop());
        System.out.println(obj.getSize());
        System.out.println(obj.pop());
        System.out.println(obj.getTop());
    }
    node top=null;
    int size=0;
    int getSize()
    {
        return this.size;
    }
    boolean isEmpty()
    {
        return top == null;
    }

    void push(int data) {
//        if (top== null) {
//            top = new Node(data);
//            size++;
//            return;
//        }
        top= new node(data, top);
        size++;
    }
   int  pop()
    {
      if (top==null)return -1;
      int data=top.data;
      top=top.next;
      size--;
      return data;
    }

    int getTop()
    {      if (top==null){
        return -1;
    }
        return top.data;
    }
}
