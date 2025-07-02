import java.util.Arrays;

public class marix90rotation1886 {
    public static void main(String[] args) {
       int[][] mat = { { 0,0,0 }, { 0,1,0 }, {1,1,1} };
        int[][] target = { { 1,1,1 }, { 0,1,0},{1,1,1} };
        int[][] flip = new int[mat.length][mat.length];

        boolean result = check(mat, target, flip );
            System.out.println(result);
            for(int a[] : mat){
                System.out.println(Arrays.toString(a));
            }
    }

        public static boolean check(int[][] mat, int[][] target, int[][] flip){
            boolean len = true;
            len = (mat.length != target.length || mat[0].length != target[0].length) ? false : len;

        int n = mat.length;    

            for(int i=0; i<4; i++){

                boolean res = true;
                for(int a =0; a<n; a++){
                    for(int b=0; b<mat[a].length; b++){
                        if ((mat[a][b] != target[a][b])) {
                            res = false;
                            break;
                        }
                    }
                    
                if (!res) break;
                   }     
                
                if (res) return true;
            

                for(int c=0; c<n; c++){
                    for(int d=0; d<mat[c].length; d++){
                        flip[d][n - 1 - c] = mat[c][d];
                    }
                }
                for(int e=0; e<n; e++){
                    for(int f=0; f<mat[e].length; f++){
                        mat[e][f] = flip[e][f];
                    }
                }
            }

        return false;
        }
    

    }




