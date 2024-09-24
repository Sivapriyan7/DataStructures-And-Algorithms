package DS_Practice.CircularLinkedList;

public class CircularLinkedList {

    private Node head;
    private Node tail;

    public CircularLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void insert(int val)
    {
        Node node = new Node(val);
        if(head==null)
        {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete (int val)
    {
        Node node = head;
        if(node==null)
        {
            return;
        }
        if(node.val==val)
        {
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node n = node.next;
            if(n.val==val)
            {
                node.next = n.next;
                break;
            }
            node = node.next;
        }while (node!= head);
    }

    public void display()
    {
        Node node = head;
        if(head != null)
        {
            do{
                System.out.print(node.val+ "->");
                node = node.next;
            }while (node!=head);
        }
    }

    private class Node{
        int val;
        Node next;

        public Node(int val)
        {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insert(12);
        list.insert(43);
        list.insert(22);
        list.insert(32);
        list.delete(32);
        list.display();
    }
}
