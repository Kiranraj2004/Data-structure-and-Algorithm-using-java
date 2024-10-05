package A2Z_Strivers_DSA.Trie;
class Node{
    public Node(){

    }
    Node []list=new Node[26];
    boolean flag;
    public boolean contains(char a){
        return list[a-'a']==null;
    }
    public void insert(char a,Node n){
        list[a-'a']=n;
    }
    public Node get(char a){
        return list[a-'a'];
    }
    public void set(){
        flag=true;
    }
    public boolean isend(){
        return flag;
    }
}
class Trie {
    static Node root;

    public Trie() {
        root=new Node();
    }

    public void insert(String word) {
        Node node=root;
        for(int i=0;i<word.length();i++){
            if(node.contains(word.charAt(i))){
                node.insert(word.charAt(i), new Node());
            }
            node=node.get(word.charAt(i));
        }
        node.set();
    }

    public boolean search(String word) {
        Node node=root;
        for(int i=0;i<word.length();i++){
            if(node.contains(word.charAt(i))){
                return false;

            }
            node=node.get(word.charAt(i));
        }
        return node.isend();
    }

    public boolean startsWith(String prefix) {
        Node node=root;
        for(int i=0;i<prefix.length();i++){
            if(node.contains(prefix.charAt(i))){
                return false;

            }
            node=node.get(prefix.charAt(i));
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
public class Implementaion_I {
    public static void main(String[] args) {
        Trie obj=new Trie();
        obj.insert("apple");
        System.out.println(obj.startsWith("s"));
    }
}
