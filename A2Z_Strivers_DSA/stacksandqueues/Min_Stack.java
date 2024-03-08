package A2Z_Strivers_DSA.stacksandqueues;

import java.util.Stack;

class MinStack {
    Stack<Integer>res;
    Stack<Integer>minimun=new Stack<>();
    public MinStack() {
       res=new Stack<>();
    }

    public void push(int val) {
       if (!minimun.isEmpty()&&val<=minimun.peek()){
           minimun.push(val);
       }else if(minimun.isEmpty()){
           minimun.push(val);
       }
       res.push(val);
    }

    public void pop() {
      int data=res.pop();
      if (data==minimun.peek()){
          minimun.pop();
      }
    }
    public int top() {
      return res.peek();
    }

    public int getMin() {
          return minimun.peek();
    }
}

public class Min_Stack {
    public static void main(String[] args) {
          MinStack obj=new MinStack();
          obj.push(-2);
        System.out.println(obj.getMin());
        obj.push(0);
        obj.push(-3);
        obj.pop();
        System.out.println(obj.getMin());
        System.out.println(obj.top());
    }
}
