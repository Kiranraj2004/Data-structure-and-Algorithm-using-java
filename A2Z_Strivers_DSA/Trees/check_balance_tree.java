package A2Z_Strivers_DSA.Trees;
//https://takeuforward.org/data-structure/check-if-the-binary-tree-is-balanced-binary-tree/
public class check_balance_tree {
    public static void main(String[] args) {

    }

//    extreme brute force method which take tc  O(N**2) and sc O(1)
//    public boolean isBalanced(TreeNode root) {
//        boolean[]res=new boolean[1];
//        helper(root,res);
//        return !res[0];
//    }
//
//    private void helper(TreeNode root, boolean[] res) {
//        if (root==null){
//            return;
//        }
//        int left=height(root.left);
//        int right=height(root.right);
//        if (Math.abs(left-right)>1){
//            res[0]=true;
//            return;
//        }
//        helper(root.left);
//        helper(root.right);
//
//    }

//    public static boolean isBalanced(TreeNode root) {
//        if (root==null)return true;
//        int left=height(root.left);
//        int right=height(root.right);
//        return  (Math.abs(left-right)<=1&&isBalanced(root.left) && isBalanced(root.right))
//
//    }
//    public static int height(Node root){
//        if (root==null){
//            return 0;
//        }
//        int left= height(root.left);
//        int right= height(root.right);
//        return Math.max(left,right)+1;
//    }


//    this is optimal solution which takes O(n) and spaceO(h) axillary;
//    public  boolean isBalanced(TreeNode root) {
//        return height(root)!=-1;
//    }
//    public int height(TreeNode root){
//        if (root==null)return 0;
//        int l=height(root.left);
//        if (l==-1)return -1;
//        int r=height(root.right);
//        if (r==-1)return -1;
//        if (Math.abs(l-r)>1){
//            return -1;
//        }
//        return Math.max(l,r)+1;
//    }
}
