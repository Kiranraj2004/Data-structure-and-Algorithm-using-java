package Trees;

public class postordertraverse {
    static int index=-1;
    public static Node createnode(int []arr){
        index++;
        if (index>=arr.length){
            return null;
        }
        if (arr[index]==-1)return null;
        Node s=new Node(arr[index]);
        s.left=createnode(arr);
        s.right=createnode(arr);
        return s;
    }
    public static void main(String[] args) {
        int[]arr={1,2,-1,-1,4,5,-1,6,7,8,-1};
        Node root=createnode(arr);
        postorder(root);
    }

    private static void postorder(Node root) {
        if (root==null)return;
        postorder(root.left);
        System.out.print(root.data +" ");
        postorder(root.right);
    }
}
