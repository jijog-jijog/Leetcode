public class marix90rotation1886 {
    public static void main(String[] args) {
        int [][] mat = {{1},{1,0}};
        int [][] target = {{0,1},{1,0}};
        int[][] flip = new int[mat.length][mat.length];
        
        boolean result = check(mat, target, target);
        System.out.println(result); 
        }

        public static boolean check(int[][] mat , int [][]flip , int[][]target){
        int n = mat.length;
        boolean res = true;
        for(int i =0)
        res = (mat.length != target.length || mat[0].length != target.length) ? false : res;
           break;

        for(int i =0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                  

        //        if ( mat[i][j] != target[i][j]) return false;
            }
        }
        
    return true;
        
       
    }
    }
 
