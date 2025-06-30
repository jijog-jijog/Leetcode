public class Diagonalsummatrix {
    public static void main(String[] args) {
        int [][] mat = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
       
        
        int sum1 = 0;
        int sum2 = 0;
        int n = mat.length;
        for(int i=0; i< mat.length; i++){
           sum1 += mat[i][i];
           sum2 += mat[i][mat.length - i -1];
        }
        int sum3 = sum1 + sum2;

        int r = 0;
        if (n % 2 == 1) {
            r = sum3 - mat[n/2][n/2];
        }

        System.out.println(r);
        // for(int a : all){
        //     System.out.println(a);
        // }
}
}
