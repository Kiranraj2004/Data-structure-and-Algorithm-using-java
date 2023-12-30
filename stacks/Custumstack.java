package stacks;

public class Custumstack {
    int[]data;
    static final int default_size=10;
    private int ptr=-1;
    public Custumstack() {
//        this is default if user does not pass any size it will take default size
//        this keyword can user for calling another constructor and we have to pass
//        the parameter
   this(default_size);
    }

    public Custumstack(int size) {
        this.data = new int[size];
    }

    void push(int value){
        if (isfull()){
            System.out.println("stack is full");
            return;
        }
        ptr++;
        data[ptr]=value;

    }

   boolean isfull() {
        return ptr==data.length-1;
    }

    int  pop() throws Exception {
        if(isempty()){
          throw new Exception("cant pop the stack is empty");
        }
           return data[ptr--];
    }

    private boolean isempty() {
        return ptr==-1;
    }

    int peak() throws Exception {
        if (isempty()){
            throw new Exception("cant peak the stack is empty");
        }
        return data[ptr];
    }

}
