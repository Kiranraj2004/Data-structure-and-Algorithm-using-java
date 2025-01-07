package stacks;

public class Dynamicstack extends Custumstack{
    public Dynamicstack(int size) {
        super(size);
    }
    public Dynamicstack() {
        super();
    }

    @Override
    void push(int value) {
        if (isfull()){
            int[]temp=new int[data.length*2];
            for (int i = 0; i < data.length ; i++) {
                temp[i]=data[i];
            }
            data=temp;
        }
        super.push(value);
    }
}
