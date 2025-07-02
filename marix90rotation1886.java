import java.util.Arrays;

public class marix90rotation1886 {
    public static void main(String[] args) {
       int[][] mat = { { 0,1 }, { 1, 0 } };
        int[][] target = { { 1,0 }, { 0,1} };
        int[][] flip = new int[mat.length][mat.length];

        boolean result = check(mat, target, flip );
            System.out.println(result);
    }

        public static boolean check(int[][] mat, int[][] target, int[][] flip){
        int n = mat.length;    

            for(int i=0; i<mat.length; i++){

                boolean res = true;
                for(int a =0; a<n; a++){
                    for(int b=0; b<mat[i].length; b++){
                        if ((mat[a][b] != target[a][b])) {
                            res = false;
                            break;
                        }
                    if (!res) {
                        break;
                    }
                    }
                if (res) {
                    return true;
                }
                }

                for(int c=0; c<n; c++){
                    for(int d=0; d<mat[i].length; d++){
                        flip[d][n - 1 - c] = mat[c][d];
                    }
                }
                for(int e=0; e<n; e++){
                    for(int f=0; f<mat[i].length; f++){
                        mat[e][f] = flip[e][f];
                    }
                }
            }

        return false;
        }
      

    }


