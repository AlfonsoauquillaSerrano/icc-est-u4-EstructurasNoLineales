package structures.trees.Ejercicio_02_invert;
import structures.node.Node;
import structures.trees.Ejercicicio_01_insert.InsertBSTTest;
public class InvertBinaryTree {

    public Node<Integer> invertTree(Node<Integer> root) {
        if (root == null) {
            return null;
        }

        Node<Integer> temp = root.getLeft();
        root.setLeft(root.getRight());
        root.setRight(temp);

        invertTree(root.getLeft());
        invertTree(root.getRight());

        return root;
    }

    public static void prinTree(Node<Integer> root) {
    prinTreeRecursivo(root, 0);
}

private static void prinTreeRecursivo(Node<Integer> actual, int nivel) {
    if (actual == null) return;
    
    prinTreeRecursivo(actual.getRight(), nivel + 1);
    String espacio = "    ".repeat(nivel);
    System.out.println(espacio + " " + actual);
    prinTreeRecursivo(actual.getLeft(), nivel + 1);
}
                             
}

