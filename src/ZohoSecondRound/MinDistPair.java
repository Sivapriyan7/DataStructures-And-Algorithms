import java.util.HashMap;
import java.util.Map;

public class MinDistPair {

    public int findMinDist(int[] arr)
    {
        int MinDist = Integer.MAX_VALUE;
        Map<Integer,Integer> Map = new HashMap<>();
        for (int i=0;i<arr.length;i++)
        {
            if (Map.containsKey(arr[i]))
            {

                int dist = i - Map.get(arr[i]);
//                System.out.println("dist"+dist);
                if (dist<MinDist)
                {
//                    System.out.println("in min dist");
                    MinDist = dist;
                }
                Map.put(arr[i],i);

            }
            else
            {
                Map.put(arr[i],i);
                System.out.println(Map);
            }
        }
        if (MinDist==Integer.MAX_VALUE)
        {
            return -1;
        }
        else
        {
            return MinDist;
        }

    }

    public static void main(String[] args)
    {
        int[] values = new int[]{7,1,2,1,1,7,1};
        MinDistPair M = new MinDistPair();

        int output = M.findMinDist(values);
        System.out.println(output);

    }

}
