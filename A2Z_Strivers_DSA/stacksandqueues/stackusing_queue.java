package A2Z_Strivers_DSA.stacksandqueues;

import java.util.LinkedList;
import java.util.Queue;

public class stackusing_queue {
    public static void main(String[] args) throws Exception {
       stack obj=new stack();
       obj.push(3);
        obj.push(2);
        obj.push(4);
        obj.push(1);
        System.out.println(obj.pop());
        System.out.println(obj.top());
    }
}
class stack{
    Queue<Integer>arr=new LinkedList<>();
    void push(int data){
        arr.add(data);
        for (int i = 0; i <arr.size()-1 ; i++) {
            arr.add(arr.remove());
        }
    }
    int pop(){
        return arr.remove();
    }
    public int top() throws Exception {
       if (arr.isEmpty()) {
               throw new Exception("cant pop the stack is empty");
       }
       return arr.peek();
    }

    public boolean empty() {
   return arr.isEmpty();
    }

}
