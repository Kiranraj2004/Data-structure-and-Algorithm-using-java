package A2Z_Strivers_DSA;

public class Node {
    int data;
    Node left;
    Node right;
    Node(){}

    Node(int val) { this.data = val; }
    Node(int val, Node left, Node right) {
        this.data = val;
        this.left = left;
        this.right = right;
    }
}
