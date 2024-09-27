package Coding_Problems.TCS;

public class EntryExit {

    public static void main(String[] args) {
        int[] entry = {5,2,4,3,1};
        int[] exit = {2,3,2,1,6};

        int diff = 0;
        int max = 0;
        for (int i=0; i<entry.length; i++)
        {
            diff = entry[i] - exit[i]+diff;
            max = max>diff?max:diff;
        }
        System.out.println(max);
    }
}
