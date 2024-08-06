package wipro.arrays;


public class nineintegernoascommandlinearguments {
    public static void main(String[] args) {
        if (args.length != 9) {
            System.out.println("Please enter 9 integer numbers");
            return;
        }

        int[][] array = new int[3][3];
        int index = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = Integer.parseInt(args[index++]);
            }
        }

        System.out.println("The given array is:");
        printArray(array);

        int biggestNumber = findBiggestNumber(array);
        System.out.println("The biggest number in the given array is " + biggestNumber);
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int findBiggestNumber(int[][] array) {
        int biggestNumber = array[0][0];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] > biggestNumber) {
                    biggestNumber = array[i][j];
                }
            }
        }

        return biggestNumber;
    }
}


