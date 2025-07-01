public class marix90rotation1886 {
    public static void main(String[] args) {
        int [][] mat = {{0,1},{1,0}};
        int [][] target = {{0,1},{1,0}};
        boolean result = check(mat, target);
        System.out.println(result); 
        }
        public static boolean check(int[][] mat , int [][]target){
        
        if (mat.length != target.length || mat[0].length != target.length) return false;


        for(int i =0; i<mat.length; i++){
            for(int j=0; j<target.length; j++){
                
        //        if ( mat[i][j] != target[i][j]) return false;
            }
        }
        
    return true;
        
       
    }
    }
 
