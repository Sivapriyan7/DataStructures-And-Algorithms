import java.util.List;



class MainSubArrays
{

    public static void subarray(int[] arr)
    {
        int size = arr.length;
        for (int i=0; i<size; i++)
        {
            for (int j=i; j<size; j++)
            {
                for (int k=i; k<=j; k++)
                {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String args[])
    {
//        System.out.println("sivapriyan");
        int [] arr = new int[]{23,2,3,4,4};
        subarray(arr);

//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.println(arr[i]);
//        }


    }
}