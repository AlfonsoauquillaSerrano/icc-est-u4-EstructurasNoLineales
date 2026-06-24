
package structures.trees.Ejercicicio_01_insert;
import models.Persona;
import structures.trees.BinaryTree;
import structures.trees.Ejercicio_02_invert.InvertBinaryTree;
import structures.node.Node;
public class InsertBSTTest {

    public void insert(int[] numeros){
        //CREAR EL ARBOL DE ENTEROS
        //INSERTAR CADA NUMERO
        BinaryTree<Integer> arbolNumeros = new BinaryTree<>();
        for (int i = 0; i < numeros.length; i++) {    
        arbolNumeros.add(numeros[i]);   
        }
        //IMPRIMIR EL ARBOL
        prinTree(arbolNumeros.getRoot());
          
    }
    public void prinTree(Node<Integer> root){
        System.out.println("Imprimiendo el arbol: ");
        prinTreeRecursivo(root,0);

        }
    private void prinTreeRecursivo(Node<Integer> actual, int nivel) {
        
        if (actual == null) {
            return;
        }       
        prinTreeRecursivo(actual.getRight(), nivel + 1);
        String espacio = "    ".repeat(nivel);
        System.out.println(espacio + " " + actual);
        prinTreeRecursivo(actual.getLeft(), nivel + 1);
    
       
    }
    

    
    
}
