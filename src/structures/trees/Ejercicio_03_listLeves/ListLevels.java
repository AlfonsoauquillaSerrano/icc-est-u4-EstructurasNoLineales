package structures.trees.Ejercicio_03_listLeves;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import structures.node.Node;

public class ListLevels {
    public List<List<Node>> listLevels(Node root) {
        List<List<Node>> resultado = new ArrayList<>();
        if (root == null) {
            return resultado;
        }

        Queue<Node> cola = new LinkedList<>();
        cola.add(root);

        while (!cola.isEmpty()) {
            int nivelActualSize = cola.size();
            List<Node> listaNivel = new ArrayList<>();

            for (int i = 0; i < nivelActualSize; i++) {
                Node nodo = cola.poll();
                listaNivel.add(nodo);

                System.out.print(nodo.getValue());
                if (i < nivelActualSize - 1) {
                    System.out.print(" -> ");
                }

                if (nodo.getLeft() != null) {
                    cola.add(nodo.getLeft());
                }
                if (nodo.getRight() != null) {
                    cola.add(nodo.getRight());
                }
            }
            
            System.out.println();
            resultado.add(listaNivel);
        }
        
        return resultado;
    }
    
}
