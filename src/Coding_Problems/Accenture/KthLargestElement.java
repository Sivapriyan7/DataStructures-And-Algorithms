package Coding_Problems.Accenture;

public class KthLargestElement {

    public static int kthLargest(int[] arr, int k)
    {
        for(int i=0; i<k; i++)
        {
            int MaxIndex = i;
            for (int j=i+1; j<arr.length; j++)
            {
                if(arr[j] > arr[MaxIndex])
                {
                    MaxIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[MaxIndex];
            arr[MaxIndex] = temp;
        }
        return arr[k-1];
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,4,50,34};
        System.out.println(kthLargest(arr,2));
    }
}
