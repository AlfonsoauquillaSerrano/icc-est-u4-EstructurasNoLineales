package structures.trees;

import structures.node.Node;;
//Crear el arbol
public class InTree {
    private Node<Integer> root;
    private int peso;

    public InTree() {
        this.root = null;
        this.peso=0;
    }

    public Node<Integer> getRoot() {
        return root;
    }

    public void setRoot(Node<Integer> root) {
        this.root = root;
    }
              
    public void setRoot(Integer value){
        Node<Integer> node = new Node<Integer>(value);
        this.root = node;
    }
    
    
    public void add (int i){
        Node<Integer> node = new Node<Integer>(i);
        root = addRecursivo(root,node);
    }

    private Node<Integer> addRecursivo(Node<Integer> actual, Node<Integer> nodeInsertar) {
        if(actual == null){
            peso++;
            return nodeInsertar;}
        if(actual.getValue()> nodeInsertar.getValue()){
          //IZQUIERDA
          actual.setLeft(addRecursivo(actual.getLeft(),nodeInsertar));
        }else{actual.setRight(addRecursivo(actual.getRight(), nodeInsertar));}
        return actual;
    }

    public void preOrder(){
        preOrderRecursivo(root);
    }

    private void preOrderRecursivo(Node<Integer> actual) {
        if(actual == null)
            return;
        System.out.println(actual);
        preOrderRecursivo(actual.getLeft());
        preOrderRecursivo(actual.getRight());
    }

     public void postOrder(){
        preOrderRecursivo(root);
    }

    private void postOrderRecursivo(Node<Integer> actual) {
        if(actual == null)
            return;
        preOrderRecursivo(actual.getLeft());
        preOrderRecursivo(actual.getRight());
        System.out.println(actual);
    }

     public void inOrder(){
        preOrderRecursivo(root);
    }

    private void inOrderRecursivo(Node<Integer> actual) {
        if(actual == null)
            return;
        preOrderRecursivo(actual.getLeft());
        System.out.println(actual);
        preOrderRecursivo(actual.getRight());
    }

    public int getHeigh(){
        return getHeighRecursivo(root);
    }

    private int getHeighRecursivo(Node<Integer> actual) {
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

    // public int getPeso(){
    //     return getPesoRecursivo(root);
    // }

    // private int getPesoRecursivo(Node<Integer> actual) {
    //     if (actual == null)
    //         return 0;
    //     int heighLeft= getPesoRecursivo(actual.getLeft());
    //     int heighRight= getPesoRecursivo(actual.getRight());

    //     return heighLeft+heighRight+1;

    // }

    
}
