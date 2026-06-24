package structures.trees.Ejercicio_04_depth;

import structures.node.Node;

public class Depth {

   public int maxDepth(Node root) {
        int profundidad = calcularProfundidad(root);
        System.out.println("La profundidad máxima es: " + profundidad);
        return profundidad;
    }

    private int calcularProfundidad(Node root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = calcularProfundidad(root.getLeft());
        int rightDepth = calcularProfundidad(root.getRight());

        return Math.max(leftDepth, rightDepth) + 1;
    }
    
}
