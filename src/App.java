import models.Persona;
import structures.node.Node;
import structures.trees.BinaryTree;
import structures.trees.Ejercicio1;
import structures.trees.Ejercicio2;
import structures.trees.InTree;
import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        runInTree();
        runBinaryTree();
        runEjercicios();
    }

    private static void runEjercicios() {
        Ejercicio1 ejercicio1 = new Ejercicio1();
        int[] numeros1 = new int[] {5,3,7,2,4,6,8};
        ejercicio1.insert(numeros1);
        

         Ejercicio2 ejercicio2 = new Ejercicio2();
        int[] numeros2 = new int[] {5,3,7,2,4,6,8};
        BinaryTree<Integer> tree = new BinaryTree<>();
        for (int numero : numeros2) {
            tree.add(numero);
        Node<Integer> root = tree.getRoot();
       
        }
       

    }

    private static void runBinaryTree() {
        BinaryTree<String> arbolStrings = new BinaryTree<>();
        BinaryTree<Persona> arbolPersonas = new BinaryTree<>();

        arbolPersonas.add(new Persona("Pablo",30));
        arbolPersonas.add(new Persona("Ana",25));
        arbolPersonas.add(new Persona("Luis",35));
        arbolPersonas.add(new Persona("Maria",28));

        
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
