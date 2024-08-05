package Coding_Problems.Accenture;

public class SuperiorElementCount {

    public static int findsuperior(int[] arr)
    {
        int superior_count = 0;
        int superior_element = -1;
        for (int i=arr.length-1; i>=0; i--)
        {
            if(arr[i] > superior_element)
            {
                superior_count++;
                superior_element = arr[i];
            }
        }
        return superior_count;
    }

    public static void main(String[] args) {
        int[] arr = {8,10,6,2,9,7};
        System.out.println(findsuperior(arr));
    }
}
