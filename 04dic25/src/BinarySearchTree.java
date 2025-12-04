public class BinarySearchTree {
    Node root; //Raiz del arbol
    public void insert(int value){
        root = insertRec(root, value);
    }
    private Node insertRec(Node current, int value){
        //caso base cuando current sea null en este punto vamos a crear el nodo
        if(current == null){
            return new Node(value);
        }
        if(value < current.value){
            current.left = insertRec(current.left, value);
        } else if(value > current.value){
            current.right = insertRec(current.right, value);
        }
        return current;
    }
    public void printInOrder(){
        System.err.println("---Print in order:---");
        printInOrderRec(root);
    }
    private void printInOrderRec(Node current){
        if(current != null){
            printInOrderRec(current.left);
            System.out.println(current.value);
            printInOrderRec(current.right);
        }
    }
}