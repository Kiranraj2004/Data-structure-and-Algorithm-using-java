package Trees;

public class sumofnodes {
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
        System.out.println(sum(root));
    }
    public static int sum(Node root){
        if (root==null){
            return 0;
        }
        int left= sum(root.left);
        int right= sum(root.right);
        return left+right+root.data;
    }
}
