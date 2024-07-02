import java.util.*;

class Answer{
    public double medianarr(int[] nums1,int[] nums2)
    {
        double s;
        List<Integer> list1 = new ArrayList<>();
        for (int num:nums1)
        {
            list1.add(num);
        }
        List<Integer> list2 = new ArrayList<>();

        for (int num:nums2)
        {
            list2.add(num);
        }

        list1.addAll(list2);

        Integer[] finalarray = list1.toArray(new Integer[0]);
        Arrays.sort(finalarray);

        if ((finalarray.length%2)==0)
        {
            int ind1 = finalarray.length/2;
            int ind2 = ind1-1;
            System.out.println(ind1);
            System.out.println(ind2);
            System.out.println(3+4);
            int val = finalarray[ind1]+finalarray[ind2];
            s = (double) val/2;
            System.out.println("df");
        }
        else {
            int index = finalarray.length/2;
            s = finalarray[index];

        }

        System.out.println(Arrays.toString(finalarray));


        return s;
    }
}


public class MedianOfTwoSorted {

    public static void main(String args[])
    {
        Scanner d = new Scanner(System.in);

        int a1 = d.nextInt();
        int a2 = d.nextInt();

        int[] arr1 = new int[a1];
        int[] arr2 = new int[a2];

        System.out.println("Enter the two arrays ");
        for(int i=0; i<a1 ; i++)
        {
            arr1[i] = d.nextInt();
        }
        for(int i=0; i<a2 ; i++)
        {
            arr2[i] = d.nextInt();
        }

        Answer a = new Answer();
        double t = a.medianarr(arr1,arr2);
        System.out.println("median : "+t);
    }
}
