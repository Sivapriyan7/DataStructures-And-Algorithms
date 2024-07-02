package DataStructures_Algorithms.Tree;

public class Main {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.insert(65);
        tree.insert(72);
        tree.insert(71);
        tree.insert(7);
        tree.insert(4);
        tree.insert(47);
        System.out.print("InOrder :");
        tree.inOrder();
        System.out.println();
        System.out.print("PreOrder :");
        tree.preOrder();
    }
}
