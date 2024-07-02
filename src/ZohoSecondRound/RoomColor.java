package ZohoSecondRound;

public class RoomColor {

    public static void main(String[] args) {
        int width = 10;
        int height = 5;
        char color1 = 'X';
        char color2 = 'O';

        char[][] grid = createRoomDesign(width, height, color1, color2);
        printGrid(grid);
    }

    public static char[][] createRoomDesign(int width, int height, char color1, char color2) {
        char[][] grid = new char[height][width];

        for (int row = 0; row < height; row++) {
            int period = height - row;
            for (int col = 0; col < width; col++) {
//                System.out.println((col/period)%2);
//                System.out.println(period);
                if ((col / period) % 2 == 0) {  //since there are two colors %2 is taken
                    grid[row][col] = color1;
                } else {
                    grid[row][col] = color2;
                }
            }
        }

        return grid;
    }

    public static void printGrid(char[][] grid) {
        for (char[] row : grid) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
