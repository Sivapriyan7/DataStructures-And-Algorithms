package ZohoSecondRound;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] rotatedMatrix = rotateMatrixBy90DegreesAnticlockwise(matrix);

        printMatrix(rotatedMatrix);
    }

    public static int[][] rotateMatrixBy90DegreesAnticlockwise(int[][] matrix) {
        int N = matrix.length;
        System.out.println("N value "+N);
        // Create a new matrix for the rotated result
        int[][] rotatedMatrix = new int[N][N];

        // Transpose the matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                rotatedMatrix[i][j] = matrix[j][i];
            }
        }

        printMatrix(rotatedMatrix);
        System.out.println();

        // Reverse the order of rows in the transposed matrix
        for (int i = 0; i < N / 2; i++) {
            int[] temp = rotatedMatrix[i];
            rotatedMatrix[i] = rotatedMatrix[N - 1 - i];
            rotatedMatrix[N - 1 - i] = temp;
        }

        return rotatedMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
