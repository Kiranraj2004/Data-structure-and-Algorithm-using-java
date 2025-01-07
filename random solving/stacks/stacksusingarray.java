package stacks;
public class stacksusingarray {
    static int[]arr=new int[5];
   static int top=-1;
    public static void main(String[] args) {
        push(2);
        push(9);
        push(9);
        System.out.println(pop());
    }
    public static void push (int value){
        if (top==arr.length){
            System.out.println("stacks is full ");
            return;
        }
         arr[++top]=value;
    }
    public static int pop()throws ArithmeticException{
        if (top==-1){
            throw new ArithmeticException("stack is full");
        }
        return arr[top--];
    }

}
