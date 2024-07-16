package DataStructures_Algorithms.Stack;

class DstackRunner {
    public static void main(String[] args) {
        DynamicStack nums = new DynamicStack();
        nums.push(12);
        nums.show();
        nums.push(23);
        nums.show();
        nums.push(26);
        nums.show();
        nums.push(27);
        nums.show();
        nums.push(22);
        nums.show();
        nums.pop();
        nums.pop();
        nums.pop();
        nums.show();

        nums.push(23);
        nums.push(23);
        nums.push(23);

//        System.out.println(nums.pop());
////        nums.push(34);
//        System.out.println(nums.peek());
        nums.show();
//        System.out.println();
//        System.out.println(nums.size());
//        System.out.println("Empty "+nums.isEmpty());
    }
}


class DynamicStack {

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
