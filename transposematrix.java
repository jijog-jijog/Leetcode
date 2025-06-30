import java.util.Arrays;

public class transposematrix {
    public static void main(String[] args) {
         int [][] matrix = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};

         
         
         int k =0;
         int [][] out = new int[matrix.length][];

         for(int i =0; i<matrix.length; i++){

            out[i] = new int[matrix[i].length];

            for(int j=0; j<matrix[i].length; j++){

                out[i][j] = matrix[j][i];

                k++;
            }
         }
         for(int a[] : out ){
            System.out.println(Arrays.toString(a));
         }
    }
   
}
