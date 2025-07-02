import java.util.Arrays;

public class marix90rot {
    public static void main(String[] args) {
        int[][] mat = { { 1, 0 }, { 1, 0 } };
        int[][] target = { { 0, 1 }, { 1, 0 } };
        int[][] flip = new int[mat.length][mat.length];

        boolean result = check(mat, target, flip);
        System.out.println(result);
    }

    public static boolean check(int[][] mat, int[][] target, int[][] flip) {
        int n = mat.length;

        for (int i = 0; i < 4; i++) {
            // Check if mat equals target
            if (areEqual(mat, target)) {
                return true;
            }

            // Rotate mat by 90 degrees into flip
            for (int r = 0; r < n; r++) {
                for (int c = 0; c < n; c++) {
                    flip[c][n - 1 - r] = mat[r][c];
                }
            }

            // Copy flip to mat for the next iteration
            for (int r = 0; r < n; r++) {
                for (int c = 0; c < n; c++) {
                    mat[r][c] = flip[r][c];
                }
            }
        }

        return false;
    }

    // Helper to check matrix equality
    public static boolean areEqual(int[][] a, int[][] b) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != b[i][j]) return false;
            }
        }
        return true;
    }
}
