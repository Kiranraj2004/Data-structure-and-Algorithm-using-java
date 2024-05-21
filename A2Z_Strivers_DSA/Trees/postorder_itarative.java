package A2Z_Strivers_DSA.Trees;

public class postorder_itarative {
    public static void main(String[] args) {

    }
//    public List<Integer> postorderTraversal(TreeNode root) {
//        List<Integer>res=new ArrayList<Integer>();
//        postorder(root,res);
//        return res;
//
//    }
//    private static void postorder(TreeNode root, List<Integer> res) {
//        if (root==null)return;
//        postorder(root.left, res);
//        postorder(root.right, res);
//        res.add(root.val);
//    }


//    tc O(2n)
//        scO(n)
//    public List<Integer> postorderTraversal(TreeNode root) {
//        Stack<TreeNode>s1=new Stack<TreeNode>();
//        List<Integer>s2=new ArrayList<>();
//        if (root==null){
//            return  s2;
//        }
//        s1.add(root);
//        while(!s1.isEmpty()){
//            TreeNode t=s1.pop();
//            if (t.left!=null)s1.add(t.left);
//            if (t.right!=null)s1.add(t.right);
//           s2.add(t.val);
//        }
//        Collections.reverse(s2);
//        return s2;
//    }


//    public List<Integer> postorderTraversal(TreeNode root) {
//        Stack<TreeNode>r=new Stack<TreeNode>();
//        List<Integer>res=new ArrayList<>();
//        while(root!=null||!r.isEmpty()){
//            if (root!=null){
//                r.add(root);
//                root=root.left;
//            }
//            else{
//                TreeNode t=r.peek().right;
//                if (t==null){
//                    t=r.pop();
//                    res.add(t.val);
//                    while(!r.isEmpty()&&r.peek().right==t){
//                       t= r.pop();
//                        res.add(t.val);
//                    }
//
//                }
//                else{
//                    root=t;
//                }
//
//            }
//        }
//        return res;

//    }

}
