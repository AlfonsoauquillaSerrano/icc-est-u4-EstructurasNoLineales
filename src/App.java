import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import Collections.Set.Sets;
import Collections.maps.Maps;
import models.Persona;
import structures.node.Node;
import structures.trees.BinaryTree;
import structures.trees.InTree;
import structures.trees.Ejercicicio_01_insert.InsertBSTTest;
import structures.trees.Ejercicio_02_invert.InvertBinaryTree;
import structures.trees.Ejercicio_03_listLeves.ListLevels;
import structures.trees.Ejercicio_04_depth.Depth;
import models.Persona;
import models.Contacto;
import java.util.HashMap;
import java.util.Map;
import Collections.maps.Maps;

public class App {
    public static void main(String[] args) throws Exception {
        // runInTree();
        // System.out.println("");
        // runBinaryTree();
        // System.out.println("");
        // runEjercicios();
        // System.out.println("");
        // runSet();
        runMap();
    }

    private static void runMap() {
        Maps maps= new Maps();
        System.out.println("HashMap");
        maps.construirHashMap();
        System.out.println("LinkedHashMap");
        maps.cLinkedHashMap();
        System.out.println("TreeMap");
        maps.cTreeMap();
    }

    private static void runSet() {
        Sets sets = new Sets();
        //Implementacion basada en hashSet hash Code
        System.out.println("HashCode: ");
        Set<String> hashSet = sets.construirHashSet();
        System.out.println(hashSet);
        System.out.println("Size = "+ hashSet.size());
        System.out.println(hashSet.contains("F"));

        //Implementacion basada en LinkedhashSet hash Code
        System.out.println("LinkedHashCode: ");
        Set<String> lSet = sets.construirLinkedHashSet();
        System.out.println(lSet);
        System.out.println("Size = "+ lSet.size());
        System.out.println(lSet.contains("F"));

        //Implementacion basada en TreeSet 
        System.out.println("TreeSet: ");
        Set<String> tSet = sets.construirTreeHashSet();
        System.out.println(tSet);
        System.out.println("Size = "+ tSet.size());
        System.out.println(tSet.contains("F"));
        
        //Implementacion basada en Contacto
        System.out.println("Contacto: ");
        Set<Contacto> cSet = sets.construirHashSetContacto();
        System.out.println(cSet);
        System.out.println("Size = "+cSet.size());
        System.out.println(cSet.contains("F"));

        //Implementacion basada en TreeContacto
        System.out.println("Contacto: ");
        Set<Contacto> tCSet = sets.construirTreeSetContacto();
        System.out.println(tCSet);
        System.out.println("Size = "+tCSet.size());
        System.out.println(tCSet.contains("F"));
        
   

    }

    private static void runEjercicios() {
        System.out.println("Ejercicio_1: InsertBSTTest");
        System.out.println("");
        InsertBSTTest ejercicio1 = new InsertBSTTest();
        int[] numeros1 = new int[] {10,9,8,7,6,5,4,3,2,1,0,-1,-2};
        ejercicio1.insert(numeros1);
        System.out.println("Resultado generado correctamente");
        System.out.println("");

        System.out.println("Ejercicio_2: InvertBinaryTree");
        System.out.println("");
        InvertBinaryTree ejercicio2 = new InvertBinaryTree();
        int[] numeros2 = new int[] {10,9,8,7,6,5,4,3,2,1,0,-1,-2};
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
        int[] numeros3 = new int[] {10,9,8,7,6,5,4,3,2,1,0,-1,-2};
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
        int[] numeros4 = new int[] {10,9,8,7,6,5,4,3,2,1,0,-1,-2};
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
