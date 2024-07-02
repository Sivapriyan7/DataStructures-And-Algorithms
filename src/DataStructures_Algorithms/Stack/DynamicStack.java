package DataStructures_Algorithms.Stack;

public class DynamicStack {

    int capacity = 2;
    int stack[] = new int[capacity];
    int top = 0;

    public void push(int data)
    {
        if(size()==capacity)
        {
            expand();
        }
        stack[top++] = data;
    }

    private void expand() {
        int length = size();
        int[] newStack = new int[capacity*2];
        System.arraycopy(stack,0,newStack,0,length);
        stack = newStack;
        capacity *= 2;
    }

    private void shrink() {
        int length = size();
        int cap = (capacity/2)/2;
//        System.out.println("length "+length+"capacity "+cap);
        if(length <= cap) {
            capacity /= 2;

            int newStack[] = new int[capacity];
            System.arraycopy(stack, 0, newStack, 0, length);
            stack = newStack;
        }
    }

    public void show()
    {
        for(int n:stack)
        {
            System.out.print(n+" ");
        }
        System.out.println();
    }
    public int pop()
    {
        int data = 0;
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
        }
        else {
            data = stack[--top];
            stack[top] = 0;
            shrink();
        }
        return data;
    }


    public int peek()
    {
        int data = stack[top-1];
        return data;
    }
    public int size()
    {
        return top;
    }
    public boolean isEmpty()
    {
        return top<=0;

    }


}
