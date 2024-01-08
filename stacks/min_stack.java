package stacks;

import java.util.Stack;

public class min_stack {
    public static void main(String[] args) {

        min_stack w=new min_stack();
//        w.push(1);
//        System.out.println(w.getMin());
//        w.push(0);
//        System.out.println(w.getMin());
//        w.pop();
//        System.out.println(w.getMin());
        w.push(46);
        w.push(46);
        w.push(47);
        w.pop();
        w.pop();
        w.pop();
        w.push(47);
        System.out.println(w.getMin());
        System.out.println(w.min);


    }

   private Stack<Integer>s;
    int []min;
    int i=0;
    public min_stack() {
        s=new Stack<>();
        min=new int[10];
    }
    public void push(int val) {
        if (s.isEmpty()){
            s.push(val);
            i=0;
            min[i]=0;
            return;
        }
        s.push(val);
        if (s.get(min[i])>val){
            min[++i]=s.size()-1;
        }

    }

    public void pop() {
      s.pop();
      if (min[i]>s.size()-1){
          i--;
      }
    }

    public int top() {
    return s.peek();
    }

    public int getMin() {
   return s.get(min[i]);
    }
}
