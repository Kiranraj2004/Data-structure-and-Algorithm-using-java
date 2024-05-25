package A2Z_Strivers_DSA.Trees;

import java.util.*;

public class Top_View_of_Binary_Tree {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Map<Integer, Integer> mpp = new TreeMap<>();
        Queue<Node>n=new LinkedList<>();
        Queue<Integer>i=new LinkedList<>();
        n.add(root);
        i.add(0);
        while(!n.isEmpty()){
            int index=i.remove();
            Node temp=n.remove();
            if (!mpp.containsKey(index)){
                mpp.put(index,temp.data);
            }
            if (temp.left!=null){
                n.add(temp.left);
                i.add(index-1);
            }
            if (temp.right!=null){
                n.add(temp.right);
                i.add(index+1);
            }
        }
        ans.addAll(mpp.values());
        return ans;
    }
}
