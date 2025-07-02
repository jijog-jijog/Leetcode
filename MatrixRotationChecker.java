import java.util.Arrays;

public class MatrixRotationChecker {
    public static void main(String[] args) {
        int[][] mat = { { 0,1 }, { 1, 0 } };
        int[][] target = { { 1,0 }, { 0,1} };
        int[][] flip = new int[mat.length][mat.length];

        boolean result = check(mat, target, flip);
        System.out.println(result);
        for (int[] a : mat) {
            System.out.println(Arrays.toString(a));
        }
    }

    public static boolean check(int[][] mat, int[][] target, int[][] flip) {
        int n = mat.length;

        if (mat.length != target.length || mat[0].length != target[0].length) {
            return false;
        }

        for (int i = 0; i < 4; i++) {
            // Check for match
            boolean isEqual = true;
            for (int x = 0; x < n; x++) {
                for (int y = 0; y < n; y++) {
                    if (mat[x][y] != target[x][y]) {
                        isEqual = false;
                        break;
                    }
                }
                if (!isEqual) break;
            }

            if (isEqual) return true;

            // Rotate mat into flip
            for (int k = 0; k < n; k++) {
                for (int j = 0; j < n; j++) {
                    flip[j][n - 1 - k] = mat[k][j];
                }
            }

            // Copy flip to mat
            for (int a = 0; a < n; a++) {
                for (int b = 0; b < n; b++) {
                    mat[a][b] = flip[a][b];
                }
            }
        }

        return false; // No match in any rotation
    }
}
