package DS_Practice.Stack;

class Runner{

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(232);
        System.out.println(stack.pop());
        stack.push(323);
        stack.push(323);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

    }
}

class Stack {
    int[] stack = new int[10];
    int top;

    public void push(int data)
    {
        if (!isFull())
        {
            stack[top++] = data;
            System.out.println("Inserted "+data);
        }
        else {
            System.out.println("Stack is Full.");
        }
    }

    public int pop()
    {
        if (!isEmpty())
        {
            return stack[--top];
        }
        else {
            System.out.println("Stack is Empty.");
        }
        return 0;
    }

    public int peek()
    {
        if (!isEmpty())
        {
            return stack[top-1];
        }
        else {
            System.out.println("Stack is Empty");
        }
        return 0;
    }

    public boolean isFull() {
        return top==stack.length;
    }

    public boolean isEmpty()
    {
        return top==0;
    }
}
