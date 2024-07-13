package DS_Practice.BTee;
//
//public class BinaryTree {
//}

import java.util.*;

class Node {
    int value;
    Node left, right;

    Node(int value) {
        this.value = value;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;

    void add(int value) {
        root = addRecursive(root, value);
    }

    Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        }

        return current;
    }

    void printTree() {
        List<List<String>> lines = new ArrayList<>();
        List<Node> level = new ArrayList<>();
        List<Node> next = new ArrayList<>();
        level.add(root);
        int nn = 1;
        int widest = 0;

        while (nn != 0) {
            List<String> line = new ArrayList<>();
            nn = 0;

            for (Node n : level) {
                if (n == null) {
                    line.add(null);
                    next.add(null);
                    next.add(null);
                } else {
                    String aa = String.valueOf(n.value);
                    line.add(aa);
                    if (aa.length() > widest) widest = aa.length();

                    next.add(n.left);
                    next.add(n.right);

                    if (n.left != null) nn++;
                    if (n.right != null) nn++;
                }
            }

            if (widest % 2 == 1) widest++;

            lines.add(line);

            List<Node> tmp = level;
            level = next;
            next = tmp;
            next.clear();
        }

        int perpiece = lines.get(lines.size() - 1).size() * (widest + 4);
        for (int i = 0; i < lines.size(); i++) {
            List<String> line = lines.get(i);
            int hpw = (int) Math.floor(perpiece / 2f) - 1;

            if (i > 0) {
                for (int j = 0; j < line.size(); j++) {
                    char c = ' ';
                    if (j % 2 == 1) {
                        if (line.get(j - 1) != null) {
                            c = (line.get(j) != null) ? '┴' : '┘';  //'┴ alt 193' '┘ 217'
                        } else {
                            if (j < line.size() && line.get(j) != null);  //'└';  '└ 192'
                        }
                    }
                    System.out.print(c);

                    if (line.get(j) == null) {
                        for (int k = 0; k < perpiece - 1; k++) {
                            System.out.print(" ");
                        }
                    } else {
                        for (int k = 0; k < hpw; k++) {
                            System.out.print(j % 2 == 0 ? " " : "─"); //'─ 196'
                        }
                        System.out.print(j % 2 == 0 ? "┌" : "┐");  //'┌ 218' '┐ 191'
                        for (int k = 0; k < hpw; k++) {
                            System.out.print(j % 2 == 0 ? "─" : " ");
                        }
                    }
                }
                System.out.println();
            }

            for (String f : line) {
                if (f == null) f = "";
                float a = (float) (perpiece / 2f - f.length() / 2f);
                float b = (float) (perpiece / 2f - f.length() / 2f);

                while (a + b < perpiece - f.length()) b++;
                while (a + b > perpiece - f.length()) b--;

                for (int j = 0; j < a; j++) System.out.print(" ");
                System.out.print(f);
                for (int j = 0; j < b; j++) System.out.print(" ");
            }
            System.out.println();

            perpiece /= 2;
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(50);
        tree.add(30);
        tree.add(20);
        tree.add(23);
        tree.add(16);
        tree.add(40);
        tree.add(70);
        tree.add(60);
        tree.add(75);
        tree.add(72);
        tree.add(82);
        tree.add(55);
        tree.add(65);
        tree.add(35);
        tree.add(45);


        tree.printTree();
    }
}
