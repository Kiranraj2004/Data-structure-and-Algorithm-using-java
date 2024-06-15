package A2Z_Strivers_DSA.recursion;

import java.util.ArrayList;

public class subsequences {
    public static void main(String[] args) {
        int[]arr={3,1,2};
        ArrayList<Integer>res=new ArrayList<>();
        sub(arr,0,res);

    }
    public static void sub(int[]arr,int index,ArrayList<Integer> res){
        if(index>=arr.length){
            System.out.print(res);
            return;
        }
        res.add(arr[index]);

        sub(arr,index+1,res);
        res.remove(res.size()-1);
        sub(arr,index+1,res);
    }
}
