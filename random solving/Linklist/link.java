package Linklist;

import java.util.Arrays;
import java.util.LinkedList;

public class link {
    public static void main(String[] args) {
        LinkedList<Integer>n[];
        n=new LinkedList[4];
        for (int i = 0; i <n.length ; i++) {
            n[i]=new LinkedList<>();
        }
        n[0].add(2);
        n[0].add(3);
        System.out.println(Arrays.toString(n));
    }
}
