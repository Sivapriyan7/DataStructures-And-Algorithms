package DS_Practice.Stack;

class SNode {

    int data;
    SNode next;

    public SNode(int val)
    {
        this.data = val;
        this.next = null;
    }
}

class Stackl{
    int size;
    SNode top;

    public Stackl()
    {
        top = null;
    }

    void push(int data)
    {
        SNode temp = new SNode(data);
        if(top==null)
        {
            top = temp;
        }
        else {
            temp.next = top;
            top = temp;
        }
        size++;
    }

    void pop()
    {
        if(top==null)
        {
            System.out.println("Stack is Empty");
        }
        else {
            SNode temp = top;
            top = top.next;
            System.out.println("Poped Element "+temp.data);
        }
        size--;
    }

    void peek()
    {
        if(top==null)
        {
            System.out.println("Stack is Empty");
        }
        else {
            System.out.println("Peek Element "+top.data);
        }
    }

    void printStack()
    {
        SNode temp = top;
        System.out.println("Stack Data");
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    void getSize()
    {
        System.out.println("Size "+size);
    }
    public static void main(String[] args) {

        Stackl stack = new Stackl();
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        stack.push(16);

        stack.printStack();
        stack.getSize();

    }
}
