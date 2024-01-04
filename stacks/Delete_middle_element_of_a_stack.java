package stacks;

import java.util.Stack;

public class Delete_middle_element_of_a_stack {
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
//        s.push(50);
        System.out.println(s.size());
        System.out.println(s);
        deleteMid(s,s.size());
        System.out.println(s);


    }
    public  static void deleteMid(Stack<Integer> s, int sizeOfStack){
        int mid =(int)Math.floor((double) (sizeOfStack + 1) /2)-1;
        s.remove(mid);
    }
}
