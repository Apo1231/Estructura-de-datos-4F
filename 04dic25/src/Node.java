public class Node {
    int value;
    Node left;
    Node right;
    //Fabrica de hojas
    public Node(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
}