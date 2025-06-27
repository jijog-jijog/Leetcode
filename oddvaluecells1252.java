import java.util.Arrays;

public class oddvaluecells1252 {
    public static void main(String[] args) {
        int m =2;
        int n = 2;
        int [][] indices = {{1,1},
                            {0,0}};

        int [][] matrix = new int[m][n];
        
        for(int r=0; r<indices.length; r++){
            for(int c=0; c<indices[r].length-1; c++){
                matrix[c][c] += 1;
            }
        }

        for(int[] a : matrix){
            System.out.println(Arrays.toString(a));
        }


    }
}
