import java.util.Scanner;

public class TwoSumTwoPointer {
    public static void main(String args[])
    {
        Scanner d = new Scanner(System.in);
        System.out.printf("Enter the number of elements: ");
        int n=d.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=d.nextInt();
        }
        System.out.println("Enter the Target of the Sum: ");
        int k = d.nextInt();
        Solution sol = new Solution();
        int[] results = sol.twoSum(arr,k);
        if(results.length==2)
        {
            System.out.println("Index1 : "+results[0]+" Index2 : "+results[1]);
        }
        else{
            System.out.println("No Index found");
        }
    }
}
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start_pointer=0;
        int end_pointer=numbers.length-1;
        int num_a,num_b;

        while (start_pointer<end_pointer)
        {
            num_a = numbers[start_pointer];
            num_b = numbers[end_pointer];

            if ((num_a + num_b)==target) break;

            if ((num_a + num_b )<target)
            {
                start_pointer++;
                continue;
            }
            end_pointer--;
        }
        return new int[] {start_pointer+1,end_pointer+1};
    }
}