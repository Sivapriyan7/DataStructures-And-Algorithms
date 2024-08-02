package Coding_Problems.Accenture;

public class MaxParkingLot {

    // Function to find the maximum number of cars that can be parked consecutively
    public static int maxCarsParked(char[] arr, int n) {
        int maxCars = 0;  // Maximum number of cars that can be parked
        int currentCars = 0;  // Current consecutive empty slots

        // Iterate through the parking lot array
        for (int i = 0; i < n; i++) {
            if (arr[i] == 'S') {
                currentCars++;  // Increment current cars count for each empty slot
                if (currentCars > maxCars) {
                    maxCars = currentCars;  // Update max cars if current is greater
                }
            } else {
                currentCars = 0;  // Reset current cars count when an occupied slot is found
            }
        }
        return maxCars;
    }

    public static void main(String[] args) {
        char[] arr = {'S', 'S', 'X', 'S', 'S', 'S', 'X', 'S'};
        int n = arr.length;

        int result = maxCarsParked(arr, n);
        System.out.println("Maximum number of cars that can be parked: " + result);
    }
}
