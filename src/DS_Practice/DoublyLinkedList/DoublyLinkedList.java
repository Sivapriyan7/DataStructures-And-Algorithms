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

    public void insertAt(int index,int data)
    {
        if (index==1)
        {
            addAtFirst(data);
        }
        else {
            Node current = head;
            for (int i=1; i<index-1; i++)
            {
                current = current.next;
            }
            if(current.next==null)
            {
                addAtLast(data);
            }
            else {
                Node temp = new Node(data);
                temp.next = current.next;
                temp.prev = current;
                current.next = temp;
                current.next.prev = temp;
            }
        }
    }
    public void deleteAt(int index)
    {
        if(index==1)
        {
            deleteFirst();
        }

        Node current = head;
        for (int i=1; i<index;i++)
        {
            current = current.next;
        }

        if(current.next==null)
        {
            deleteLast();
        }
        else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
            current.next = null;
            current.prev = null;
        }

    }
    public void deleteFirst()
    {
        head = head.next;
        head.prev = null;
    }
    public void deleteLast()
    {
        tail = tail.prev;
        tail.next = null;
    }

    public static void main(String[] args) {
        DoublyLinkedList DlList = new DoublyLinkedList();
        DlList.addAtFirst(11);
        DlList.addAtFirst(12);
        DlList.addAtFirst(13);
        DlList.addAtFirst(14);
        DlList.addAtLast(22);
        DlList.insertAt(6,200);
        DlList.deleteAt(5);
//        DlList.deleteFirst();
//        DlList.deleteFirst();
//        DlList.deleteLast();
        DlList.show();
    }

}
