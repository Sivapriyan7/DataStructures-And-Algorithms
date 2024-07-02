import java.util.HashMap;
import java.util.Map;

public class ColorSockPair {

    public int findPairs(int[] arr) {
        Map<Integer, Integer> Map = new HashMap<>();

        int SockPairs = 0;
        for (int i = 0; i < arr.length; i++) {
            Map.put(arr[i], Map.getOrDefault(arr[i], 0) + 1);
        }
        for (int val : Map.values())
        {
            SockPairs += val/2;
        }

        System.out.println(Map);
        return SockPairs;
    }

    public static void main(String[] args)
    {
        int[] arr = new int[]{10,20,20,10,10,30,50,10,20,10,20,10};
        ColorSockPair c = new ColorSockPair();
        System.out.println(c.findPairs(arr));

    }
}
