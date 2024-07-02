package DataStructures_Algorithms.Stack;

public class Runner {

    public static void main(String[] args) {
        Stack nums = new Stack();
        nums.push(12);
        nums.push(23);
        nums.push(26);
        nums.push(27);
        System.out.println(nums.pop());
//        nums.push(34);
        System.out.println(nums.peek());
        nums.show();
        System.out.println();
        System.out.println(nums.size());
        System.out.println("Empty "+nums.isEmpty());
    }
}
