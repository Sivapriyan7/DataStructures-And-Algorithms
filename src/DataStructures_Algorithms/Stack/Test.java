package DataStructures_Algorithms.Stack;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String input = "ABCDXYZ";
        int numRows = 3;
        String result = convertZigzag(input, numRows);
        System.out.println(result);  // Output: AXBDYCZ
    }

    public static String convertZigzag(String s, int numRows) {
        if (numRows == 1) return s;

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++)
            rows.add(new StringBuilder());

        int currentRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows.get(currentRow).append(c);
            if (currentRow == 0 || currentRow == numRows - 1) goingDown = !goingDown;
            currentRow += goingDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) result.append(row);
        return result.toString();
    }
}

