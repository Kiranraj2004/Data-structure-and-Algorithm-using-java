package A2Z_Strivers_DSA.stacksandqueues;

import java.util.Stack;

public class Implement_Queue_using_Stacks {
    public static void main(String[] args) {
          queue obj=new queue();
          obj.push(10);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        System.out.println(obj.pop());
        System.out.println(obj.pop());
    }
}
class queue{
    Stack<Integer>arr1=new Stack<>();
    Stack<Integer>arr2=new Stack<>();
    void push(int x){
       while(!arr2.isEmpty()){
           arr1.push(arr2.pop());
       }
       arr1.push(x);
       while (!arr1.isEmpty()){
           arr2.push(arr1.pop());
       }
    }
    int pop(){
        return arr2.pop();
    }
    public int peek() {
    return arr2.peek();
    }

    public boolean empty() {
         return arr2.isEmpty();
    }

}