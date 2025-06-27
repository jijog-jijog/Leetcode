import java.util.Arrays;

public class oddvalueopti {
    public static void main(String[] args) {
        
          int m = 2;
        int n = 3;
        int[][] indices = {
            {0, 1},
            {1, 1}
        };

        // Step 1: Create row and column counters
        int[] row = new int[m];
        int[] col = new int[n];

        // Step 2: For each operation, increment corresponding row and column
        for (int[] index : indices) {
            row[index[0]]++;
            col[index[1]]++;
        }
    }
}
