package stacks;

import java.util.Stack;

public class Inbuiltstacks {
    public static void main(String[] args) {
//        stacks are class
        Stack<Integer>a=new Stack<>();
        System.out.println(a.capacity());
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        System.out.println(a.pop());
        System.out.println(a.contains(2));
        System.out.println(a.peek());
        System.out.println(a.remove(0));
//        its going to delete the element and the given index
        System.out.println(a.size());

    }
}
