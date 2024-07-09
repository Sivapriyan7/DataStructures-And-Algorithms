package DS_Practice.Stack;

class Node{

    int data;
    Node next;

    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }

}

class LinkedLIst {

    Node head;

    public void add(int data)
    {
        Node node = new Node(data);
        if(head==null)
        {
            head = node;
        }
        else
        {
            Node n = head;
            while (n.next!=null)
            {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void addAtFirst(int data)
    {
        Node node = new Node(data);
        if (head==null)
        {
            head = node;
        }
        else
        {
            node.next = head;
            head = node;
        }
    }

    public void addAt(int index, int data)
    {
        if (index==0)
        {
            addAtFirst(data);
        }
        else
        {
            Node node = new Node(data);
            Node n = head;
            for (int i=0;i<index-1;i++)
            {
                n = n.next;
            }

        }

    }

    public void show()
    {
        Node n = head;
        System.out.println("Elements of Linked List");
        while (n.next!=null)
        {
            System.out.print(n.data+"-->");
            n = n.next;
        }
        System.out.print(n.data+"-->");
        System.out.print("null");
    }

    public static void main(String[] args) {

        LinkedLIst list = new LinkedLIst();
        list.add(21);
        list.add(22);
        list.add(23);
        list.add(24);
        list.add(25);
        list.addAtFirst(20);
        list.show();
    }
}
