package DataStructures_Algorithms.Stack;

public class DstackRunner {
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
