package DS_Practice.DoublyLinkedList;

class Node
{
    int data;
    Node prev;
    Node next;

    public Node(int data)
    {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {

    Node head;
    Node tail;
    public void addAtFirst(int data)
    {
        Node temp = new Node(data);
        if (head==null)
        {
            head = temp;
            tail = temp;
        }
        else
        {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
    }

    public void addAtLast(int data)
    {
        if(tail==null)
        {
            addAtFirst(data);
        }
        else {
            Node temp = new Node(data);
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }

    public void show()
    {
        Node n = head;
        System.out.print("null");
        while(n.next!=null)
        {
            System.out.print("<-->"+n.data);
            n = n.next;
        }
        System.out.print("<-->"+n.data);
        System.out.print("<-->null");
    }

    public void insertAt(int data)
    {

    }

    public static void main(String[] args) {
        DoublyLinkedList DlList = new DoublyLinkedList();
        DlList.addAtFirst(11);
        DlList.addAtFirst(12);
        DlList.addAtFirst(13);
        DlList.addAtFirst(14);
        DlList.addAtLast(22);
        DlList.show();
    }

}
