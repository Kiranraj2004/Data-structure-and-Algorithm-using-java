package A2Z_Strivers_DSA.recursion.Hard_recursion_problem;

import java.util.ArrayList;

public class Generate_all_binary_strings_without_consecutive_1_s {
    public static void main(String[] args) {
        print1s(4,new ArrayList<Integer>());

    }
    public static  void print1s(int n,ArrayList<Integer>res){
        if (res.size()==n){
            System.out.print(res);
            return;
        }
        res.add(0);
        print1s(n,res);
        res.remove(res.size()-1);
        if (res.isEmpty()){
            res.add(1);
            print1s(n,res);
            res.remove(res.size()-1);
        }
        else if (res.get(res.size()-1)!=1){
            res.add(1);
            print1s(n,res);
            res.remove(res.size()-1);
        }
    }
}
