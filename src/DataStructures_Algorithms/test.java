package DataStructures_Algorithms;



import java.util.*;

class Shipment {

    public static long getMaxUnits(List<Long> boxes, List<Long> unitsPerBox, long truckSize) {
        int n = boxes.size();
        List<long[]> products = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            products.add(new long[] { boxes.get(i), unitsPerBox.get(i) });
        }

        // Sort products by units per box in descending order
        products.sort((a, b) -> Long.compare(b[1], a[1]));

        long maxUnits = 0;
        long remainingTruckSize = truckSize;

        for (long[] product : products) {
            long boxCount = product[0];
            long units = product[1];

            if (boxCount <= remainingTruckSize) {
                maxUnits += boxCount * units;
                remainingTruckSize -= boxCount;
            } else {
                maxUnits += remainingTruckSize * units;
                break;
            }
        }

        return maxUnits;
    }

    public static void main(String[] args) {
        List<Long> boxes = Arrays.asList(1L, 2L, 3L);
        List<Long> unitsPerBox = Arrays.asList(3L, 2L, 1L);
        long truckSize = 3L;

        long result = getMaxUnits(boxes, unitsPerBox, truckSize);
        System.out.println("The maximum number of units that can be shipped is: " + result); // Output: 7
    }
}

