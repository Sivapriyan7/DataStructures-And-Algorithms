package ZohoSecondRound;


public class RotateMatrix90 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        rotateMatrixBy90Degreesclockwise(matrix);
        System.out.println();
//        rotateMatrixBy90DegreesAnticlockwise(matrix);

    }

    public static void rotateMatrixBy90Degreesclockwise(int[][] matrix) {
        int N = matrix.length;
//
//        for (int row=0; row<N; row++)
//        {
//            for (int col=0;col<N; col++)
//            {
//                matrix[row][col] = matrix[col][row];
//            }
//        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }

        for (int[] row : matrix)
        {
            for (int val: row)
            {
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }


    public static void rotateMatrixBy90DegreesAnticlockwise(int[][] matrix)
    {
        int N = matrix.length;

        for (int j=N-1; j>=0; j--)
        {
            for(int i=0; i<N; i++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}