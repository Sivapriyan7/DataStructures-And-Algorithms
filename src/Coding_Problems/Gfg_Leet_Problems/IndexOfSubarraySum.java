package Coding_Problems;

import java.util.ArrayList;

public class IndexOfSubarraySum {

    public static ArrayList<Integer> subarraySum(int arr[],int n,int s)
    {
        int left = 0,right = 0;
        ArrayList<Integer> index = new ArrayList<>();
        int sum = 0;
        while (left <=n || right <=n)
        {
//            sum += arr[right];
            if(sum == s)
            {
                index.add(left+1);
                index.add(right);
                return index;
            }
            else if (sum < s)
            {
                sum += arr[right];
                right++;
            }
            else if (sum > s)
            {
                while (!(sum <= s))
                {
                    sum -= arr[left];
                    left++;
                    System.out.print("sum "+sum);
                    if(sum == s)
                    {
                        index.add(left+1);
                        index.add(right);
                        return index;
                    }
                }
                right++;
            }
//            System.out.print(sum+"  ");
        }
        index.add(-1);
        return index;
    }

    public static void main(String[] args) {
        int arr[] = {1,5};
        int n = arr.length;
        int s = 6;
        System.out.println(subarraySum(arr,n,s));
    }
}
