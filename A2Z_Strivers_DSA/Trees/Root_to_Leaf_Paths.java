package A2Z_Strivers_DSA.Trees;

import java.util.ArrayList;

public class Root_to_Leaf_Paths {
    public static void main(String[] args) {

    }

    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        ArrayList<ArrayList<Integer>>res=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer>temp=new ArrayList<>();
        helper(res,temp,root);
        return res;

    }

    private static void helper(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> temp, Node root) {
        if (root==null){
            return;
        }
        temp.add(root.data);
        if (root.left == null && root.right == null) {
            res.add(new ArrayList<>(temp));
        }
        helper(res,temp,root.left);
        helper(res,temp,root.right);
        temp.remove(temp.size()-1);
    }
}
