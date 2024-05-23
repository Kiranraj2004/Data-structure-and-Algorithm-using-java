package A2Z_Strivers_DSA.Trees;

import java.util.*;

public class Vertical_Order_Traversal_of_a_Binary_Tree {
    public static void main(String[] args) {

    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        HashMap<Integer,ArrayList<Integer>>r=new HashMap<Integer, ArrayList<Integer>>();
        List<List<Integer>>res=new ArrayList<>();
        helper(root,r,0);
        ArrayList<Integer> a = new ArrayList<>(r.keySet());
        Collections.sort(a);
        for(int i:a){
            res.add(r.get(i));
        }
        return res;
    }

    private void helper(TreeNode root, HashMap<Integer, ArrayList<Integer>> r, int i) {
      HashMap<Integer,ArrayList<Integer>>temp=new HashMap<>();
      Queue<TreeNode>q=new LinkedList<TreeNode>();
      ArrayList<Integer>s=new ArrayList<>();
      s.add(i);
      q.add(root);
      q.add(null);
      while(!q.isEmpty()){
          TreeNode t=q.peek();
          int col=s.remove(0);
          if (t==null){

          }
         else  if (!temp.containsKey(col)){
              ArrayList<Integer>f=new ArrayList<>();
              f.add(t.val);
              temp.put(col,f);
          }
          else{
              ArrayList<Integer>f=new ArrayList<>(temp.get(col));
              f.add(t.val);
              Collections.sort(f);
              temp.put(col,f);
          }



      }

    }
}
