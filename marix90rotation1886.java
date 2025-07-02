import java.util.Arrays;

public class marix90rotation1886 {
    public static void main(String[] args) {
        int[][] mat = { { 0,1 }, { 1, 0 } };
        int[][] target = { { 0, 1 }, { 1, 0 } };
        int[][] flip = new int[mat.length][mat.length];

        boolean result = check(mat, target, flip);
        System.out.println(result);
        for (int a[] : mat) {
            System.out.println(Arrays.toString(a));
            }
    
    
        }
        public static boolean check(int[][] mat , int [][]target , int[][]flip){
        int n = mat.length;
        boolean res = true;

         for(int i =0; i<4; i++){

            
            if (mat.length != target.length || mat[0].length != target.length) {
            return false;
            }

             for(int x= 0; x<mat.length; x++){
                for(int y=0; y<mat[x].length; y++){

                    if (mat[x][y] == target[x][y]) {
                      return true;  

                    }else{

                         for(int k =0; k<n; k++){
                         for(int j=0; j<mat[k].length; j++){
                         flip[j][n - 1 -k] = mat[k][j];
                         }
                        }
                    flip = mat;
                    }
                }
            }
        
             
        }
       
    return true;
    
    }
        
       
  
}
