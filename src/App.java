import models.Persona;
import structures.node.Node;
import structures.trees.BinaryTree;
import structures.trees.InTree;
import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        runInTree();
        runBinaryTree();
    }

    private static void runBinaryTree() {
        BinaryTree<String> arbolStrings = new BinaryTree<>();
        BinaryTree<Persona> arbolPersonas = new BinaryTree<>();

        arbolPersonas.add(new Persona("Pablo",30));
        arbolPersonas.add(new Persona("Ana",25));
        arbolPersonas.add(new Persona("Luis",35));
        arbolPersonas.add(new Persona("Maria",28));

        System.out.println("Pre Order");
        arbolPersonas.inOrder();
    }

    private static void runInTree() {
       InTree arbolNumero = new InTree();
       
        arbolNumero.add(50);
        arbolNumero.add(60);
        arbolNumero.add(55);
        arbolNumero.add(70);
        arbolNumero.add(10);
        arbolNumero.add(30);
        
        System.out.println("In Order");
        arbolNumero.inOrder(); 
        System.out.println("Pre Order");
        arbolNumero.preOrder();
        System.out.println("Post Order");
        arbolNumero.postOrder();

        System.out.println("La altura es: "+arbolNumero.getHeigh());
       System.out.println("El peso es: "+arbolNumero.getPeso());

    }

}
