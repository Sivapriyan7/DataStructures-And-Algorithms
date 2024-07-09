package DataStructures_Algorithms.Stack;

class Runner {

    public static void main(String[] args) {
        Stack nums = new Stack();
        nums.push(12);
        nums.push(23);
        nums.push(26);
        nums.push(27);
        System.out.println(nums.pop());
        // nums.push(34);
        System.out.println(nums.peek());
        nums.show();
        System.out.println();
        System.out.println(nums.size());
        System.out.println("Empty " + nums.isEmpty());
    }
}

class Stack {

    int stack[] = new int[5];
    int top = 0;

    public void push(int data) {
        if (top == 5) {
            System.out.println("Stack is Full");
        }
        stack[top++] = data;
    }

    public void show() {
        for (int n : stack) {
            System.out.print(n + " ");
        }
    }

    public int pop() {
        int data = stack[--top];
        stack[top] = 0;
        return data;
    }

    public int peek() {
        int data = stack[top - 1];
        return data;
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top <= 0;
    }
}
