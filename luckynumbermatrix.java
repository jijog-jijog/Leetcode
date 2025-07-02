public class luckynumbermatrix {
    public static void main(String[] args) {
        int[][] set = {{1,10,4,2},
                       {9,3,8,7},
                       {15,16,17,12}};
        for(int i=0; i<set.length; i++){

            int min =set[0][0];
            int col = 0;
            for(int j=0; j<set.length; j++){
                for(int k =0; k<set[j].length; k++){
                    if (set[j][k] < set[0][0]) {
                        set[j][k] = min;
                        col = k;
                    }
                }
            }
            boolean val = true;
            for(int l=0; l<set.length; l++){
                if (min > set[l][col]) {
                    val = false;
                    break;
                }
                }
            if (val) {
                System.out.println(min);
                break;
            }
            }
        }
    }

