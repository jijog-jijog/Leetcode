public class luckynumbermatrix {
    public static void main(String[] args) {
        int[][] set = {{1,10,4,2},
                       {9,3,8,7},
                       {15,16,17,12}};
        for(int i=0; i<set.length; i++){

            int min =set[i][0];
            int col = 0;
            for(int j=1; j<set[i].length; j++){
                    if (set[i][j] < min) {
                        min = set[i][j];
                        col = j;
                }
            }
            boolean val = true;
            for(int l=0; l<set.length; l++){
                if ( set[l][col] > min) {
                    val = false;
                    break;
                }
                }
            if (val == true) {
                System.out.println(min);
               
            
            }
            }
        }
    }

