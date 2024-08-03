package DS_Practice.LinkedList;

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
            node.next = n.next;
            n.next = node;
        }
    }

    public void deleteAtFirst()
    {
        head = head.next;
    }

    public void deleteAt(int index)
    {
        if (index==0)
        {
            deleteAtFirst();
        }
        else {
            Node n = head;
            for (int i=0; i<index-1;i++)
            {
                n = n.next;
            }
            n.next = n.next.next;
        }
    }

    public int middleElement()
    {
        Node slow = head;
        Node fast = head;
        while (fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public boolean containsCyclic()
    {
        Node slow = head;
        Node fast = head;
        while (fast!= null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
            {
                return true;
            }
        }
        return false;
    }

    public void revereseLinkedList()
    {
        Node next=null;
        Node prev=null;
        while (head!=null)
        {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        head = prev;

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
        list.addAt(2,221);
        list.deleteAt(2);
        list.addAt(2,100);
        list.addAt(3,200);
        list.show();
        list.revereseLinkedList();
        list.show();
        System.out.println();
        System.out.println("Middle Element : "+list.middleElement());
        System.out.println("Contains cyclic : "+list.containsCyclic());
    }
}
