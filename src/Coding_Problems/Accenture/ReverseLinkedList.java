package Coding_Problems.Accenture;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class ReverseLinkedList1 {

    Node head;
    public void addAtLast(int data)
    {
        Node node = new Node(data);
        if(head==null)
        {
            head = node;
        }
        else {
            Node temp = head;
            while (temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void addAtFirst(int data)
    {
        Node node = new Node(data);
        if(head != null)
        {
            node.next = head;
            head = node;
        }
    }

    public void reverse()
    {
        Node next=null,prev=null;
        while(head!=null)
        {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        head = prev;
    }

    public void display()
    {
        Node temp = head;
        while (temp.next != null)
        {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }

    public static void main(String[] args) {
        ReverseLinkedList1 list = new ReverseLinkedList1();

        list.addAtLast(12);
        list.addAtLast(13);
        list.addAtLast(14);
        list.display();
        list.reverse();
        System.out.println();
        list.display();
    }

}
