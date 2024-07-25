package DS_Practice.BinaryTree;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.FilterOutputStream;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data)
    {
        this.data = data;
    }
}

class BinaryTree {
    Node root;

    public void insert(int data)
    {
        root = insertRec(root,data);
    }

    public Node insertRec(Node root,int data)
    {
        if (root==null)
        {
            root = new Node(data);
        }
        else if (data < root.data)
        {
            root.left = insertRec(root.left,data);
        }
        else if (data > root.data)
        {
            root.right = insertRec(root.right,data);
        }
        return root;
    }

    public void inOrder()
    {
        inOrderRec(root);
    }

    public void preOrder()
    {
        preOrderRec(root);
    }

    public void postOrder()
    {
        postOrderRec(root);
    }

    public void inOrderRec(Node root)
    {
        if(root!=null)
        {
            inOrderRec(root.left);
            System.out.print(root.data+" ");
            inOrderRec(root.right);
        }
    }

    public void preOrderRec(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.data+" ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    public void postOrderRec(Node root)
    {
        if(root!=null)
        {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.data+" ");
        }
    }

    public void Height()
    {
        System.out.println("Height of Tree: "+HeightofBST(root));
    }

    public void Sum()

    {
        System.out.println("Sum of Tree Elements: "+SumofTree(root));
    }


    public void Max()
    {
        System.out.println("Max Element of Tree: "+MaxofTree(root));
    }

    public void existinTree(int data)
    {
        if(existinBSTree(root,data))
        {
            System.out.println("Element Exists in Tree");
        }
        else {
            System.out.println("Elements Does Not exist");
        }
    }

    public void deleteElement(int data)
    {
        deletBSTElement(root,data);
    }

    public Node deletBSTElement(Node root, int data)
    {
        if(root==null)
        {
            return root;
        }
        if (data < root.data)
        {
            root.left = deletBSTElement(root.left,data);
        }
        else if (data > root.data)
        {
            root.right = deletBSTElement(root.right,data);
        }
        else
        {
            if(root.left==null)
            {
                return root.right;
            }
            else if (root.right==null) {
                return root.left;
            }

            root.data = MinValue(root.right);
            root.right = deletBSTElement(root.right,root.data);
        }
        return root;
    }

    public int MinValue(Node root)
    {
        int minv = root.data;
        while (root.left!=null)
        {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    public void reverseTree()
    {
        revreseBSTree(root);
    }




    public int HeightofBST(Node root)
    {
        if(root==null) return 0;

        int lh = HeightofBST(root.left);
        int rh = HeightofBST(root.right);

        return 1+Math.max(lh,rh);
    }

    public int SumofTree(Node root)
    {
        if(root==null) return 0;

        int leftsum = SumofTree(root.left);
        int rightsum = SumofTree(root.right);

        return root.data+leftsum+rightsum;
    }

    public int MaxofTree(Node root)
    {
        if(root==null) return 0;

        int leftmax = MaxofTree(root.left);
        int rightmax = MaxofTree(root.right);

        return Math.max(Math.max(root.data,leftmax),rightmax);
    }

    public boolean existinBSTree(Node root, int data) {
        if(root==null){
            return false;
        }
        else {
            boolean inLeft = existinBSTree(root.left,data);
            boolean inRight = existinBSTree(root.right,data);
            return root.data == data || inLeft || inRight;
        }
    }

    public void revreseBSTree(Node root)
    {
        if (root==null)
        {
            return;
        }
        else
        {
            revreseBSTree(root.left);
            revreseBSTree(root.right);
            root.left = root.right;
            root.right = root.left;
        }
    }

    public void printLevelOrder()
    {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            Node tempNode = queue.poll();
            System.out.print(tempNode.data+" ");

            if(tempNode.left!=null)
            {
                queue.add(tempNode.left);
            }
            if(tempNode.right!=null)
            {
                queue.add(tempNode.right);
            }
        }
    }
    public void invertTree()
    {
        invertTree(root);

    }

    public void invertTree(Node root)
    {
        if (root==null)
            return;

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);
    }

//    public boolean isBST()
//    {
//        return checkBST(root);
//    }

    int prev_val = 0;
    public boolean checkBST(Node root) {

        if(root != null)
        {
            checkBST(root.left);
            System.out.println("prev "+prev_val +" root "+root.data);
            if (root.data > prev_val && prev_val!=0)
            {
                return false;
            }
            else {
                prev_val = root.data;
            }
            checkBST(root.right);
        }
        return true;
    }

    Node prev = null;
    private boolean isBSTUtil(Node node) {
        if (node != null) {
            // Traverse the left subtree
            if (!isBSTUtil(node.left)) {
                return false;
            }

            // Check if the current node's value is greater than the previous node's value
            if (prev != null && node.data <= prev.data) {
                return false;
            }

            // Update the previous node
            prev = node;

            // Traverse the right subtree
            return isBSTUtil(node.right);
        }

        return true;
    }

    // Function to check if the tree is a BST
    public boolean isBST() {

        return isBSTUtil(root);
    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(200);
        tree.insert(100);
        tree.insert(300);
        tree.insert(50);
        tree.insert(110);
        tree.insert(40);
        tree.insert(60);
        tree.insert(105);
        tree.insert(115);
//        tree.insert(30);
        System.out.print("InOrder:");
        tree.inOrder();
        System.out.println();
//        System.out.print("PreOrder:");
//        tree.preOrder();
//        System.out.println();
//        System.out.print("PostOrder:");
//        tree.postOrder();
//        System.out.println();
//        tree.Height();
//        System.out.println();
//        tree.Sum();
//        System.out.println();
//        tree.Max();
//        System.out.println();
//        tree.existinTree(60);
//        System.out.println();
//        tree.deleteElement(60);
//        tree.existinTree(60);
//        System.out.println();
//        tree.printLevelOrder();
//        System.out.println();
//        tree.invertTree();
//        System.out.println();
//        tree.printLevelOrder();
//        System.out.println();
        System.out.println(tree.isBST());
        //        tree.LeftSum();

    }

}
