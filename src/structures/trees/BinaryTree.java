package structures.trees;
import structures.node.Node;
public class BinaryTree<T extends Comparable<T>> {

     private Node<T> root;
    private int peso;

    public BinaryTree() {
        this.root = null;
        this.peso=0;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }
    
    public void setRoot(T value){
        Node<T> node = new Node<T>(value);
        this.root = node;
    }
    
    
    public void add (T i){
        Node<T> node = new Node<T>(i);
        root = addRecursivo(root,node);
    }

    private Node<T> addRecursivo(Node<T> actual, Node<T> nodeInsertar) {
        if(actual == null){
            peso++;
            return nodeInsertar;}
        //if(actual.getValue() > nodeInsertar.getValue()){
          //IZQUIERDA
          if (actual.getValue().compareTo(nodeInsertar.getValue())>0) {
            
          
          actual.setLeft(addRecursivo(actual.getLeft(),nodeInsertar));
        }else{actual.setRight(addRecursivo(actual.getRight(), nodeInsertar));}
        return actual;
    }

    public void preOrder(){
        preOrderRecursivo(root);
    }

    private void preOrderRecursivo(Node<T> actual) {
        if(actual == null)
            return;
        System.out.println(actual);
        preOrderRecursivo(actual.getLeft());
        preOrderRecursivo(actual.getRight());
    }

     public void postOrder(){
        preOrderRecursivo(root);
    }

    private void postOrderRecursivo(Node<T> actual) {
        if(actual == null)
            return;
        preOrderRecursivo(actual.getLeft());
        preOrderRecursivo(actual.getRight());
        System.out.println(actual);
    }

     public void inOrder(){
        preOrderRecursivo(root);
    }

    private void inOrderRecursivo(Node<T> actual) {
        if(actual == null)
            return;
        preOrderRecursivo(actual.getLeft());
        System.out.println(actual);
        preOrderRecursivo(actual.getRight());
    }

    public int getHeigh(){
        return getHeighRecursivo(root);
    }

    private int getHeighRecursivo(Node<T> actual) {
        if (actual == null)
            return 0;
        int HeighLeft= getHeighRecursivo(actual.getLeft());
        int HeighRight= getHeighRecursivo(actual.getRight());
    
        int masAlto = Math.max(HeighLeft, HeighRight);

        return masAlto+1;

    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    
}
