import java.util.Arrays;

public class marix90rotation1886 {
    public static void main(String[] args) {
        int [][] mat = {{1,0},{1,0}};
        int [][] target = {{0,1},{1,0}};
        int[][] flip = new int[mat.length][mat.length];
        
        boolean result = check(mat, target,flip);
        System.out.println(result); 
        for(int a[] : flip){
            System.out.println(Arrays.toString(a));
        }
        }
        public static boolean check(int[][] mat , int [][]flip , int[][]target){
        int n = mat.length;
        boolean res = true;
        for(int i =0; i<4; i++){
        res = (mat.length != target.length || mat[0].length != target.length) ? false : res;
        // break;

        for(int k =0; k<n; k++){
        for(int j=0; j<mat[i].length; j++){
                 flip[j][n - 1 -i] = mat[i][j];
            }
            }
        }
        
    return res;
        
    }      
  
        
    }


    

