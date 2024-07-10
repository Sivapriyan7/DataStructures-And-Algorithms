import java.util.Arrays;

public class MoveZeroToLast {

    public static void main(String[] args) {
        int[] arr = new int[]{0,2,0,45,24,0,7,5,};

        MoveZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void MoveZeros(int[] arr) {
        int p1 = 0;
        for (int i=1;i<arr.length;i++)
        {
            if(arr[p1]==0)
            {
                if (arr[i]!=0)
                {
                    arr[p1] = arr[i];
                    arr[i] = 0;
                    p1++;
                }
            }
            else
            {
                p1++;
            }
        }
    }
}
