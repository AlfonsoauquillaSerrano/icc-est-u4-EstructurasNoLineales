import models.Persona;
import structures.node.Node;
import structures.trees.BinaryTree;
import structures.trees.InTree;
import structures.trees.Ejercicicio_01_insert.InsertBSTTest;
import structures.trees.Ejercicio_02_invert.InvertBinaryTree;
import structures.trees.Ejercicio_03_listLeves.ListLevels;
import structures.trees.Ejercicio_04_depth.Depth;
import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        runInTree();
        System.out.println("");
        runBinaryTree();
        System.out.println("");
        runEjercicios();
    }

    private static void runEjercicios() {
        System.out.println("Ejercicio_1: InsertBSTTest");
        System.out.println("");
        InsertBSTTest ejercicio1 = new InsertBSTTest();
        int[] numeros1 = new int[] {8,5,9,10,7,1,0};
        ejercicio1.insert(numeros1);
        System.out.println("Resultado generado correctamente");
        System.out.println("");

        System.out.println("Ejercicio_2: InvertBinaryTree");
        System.out.println("");
        InvertBinaryTree ejercicio2 = new InvertBinaryTree();
        int[] numeros2 = new int[] {8,5,9,10,7,1,0};
        BinaryTree<Integer> tree = new BinaryTree<>();
        for (int numero : numeros2) {
            tree.add(numero);
        }
        System.out.println("Imprimiendo el arbol original:");
        ejercicio2.prinTree(tree.getRoot());   
        ejercicio2.invertTree(tree.getRoot());
        System.out.println("Imprimiendo el arbol invertido:");
        ejercicio2.prinTree(tree.getRoot());
        System.out.println("Resultado generado correctamente");
        System.out.println("");
        
        System.out.println("Ejercicio_3: ListLevels");
        System.out.println("");
        ListLevels ejercicio3 = new ListLevels();
        int[] numeros3 = new int[] {8,5,9,10,7,1,0};
        BinaryTree<Integer> tree3 = new BinaryTree<>();
        for (int numero : numeros3) {
            tree3.add(numero);
        }
        ejercicio3.listLevels(tree3.getRoot());
        System.out.println("Resultado generado correctamente");
        System.out.println("");
        
        System.out.println("Ejercicio_4: Depth");
        System.out.println("");
        Depth ejercicio4 = new Depth();
        int[] numeros4 = new int[] {8,5,9,10,7,1,0};
        BinaryTree<Integer> tree4 = new BinaryTree<>();
        for (int numero : numeros4) {
            tree4.add(numero);
        }
        ejercicio4.maxDepth(tree4.getRoot());
        System.out.println("Resultado generado correctamente");
        System.out.println("");
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
