public class Diagonalsummatrix {
    public static void main(String[] args) {
        int [][] mat = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        int [] all = new int[mat.length*3];
        
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0; i< mat.length; i++){
           sum1 += mat[i][i];
           sum2 += mat[i][mat.length - i -1];
        }
        
        System.out.println(sum1 + sum2);
        // for(int a : all){
        //     System.out.println(a);
        // }
}
}
