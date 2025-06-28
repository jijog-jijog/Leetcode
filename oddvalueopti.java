import java.util.Arrays;

public class oddvalueopti {
    public static void main(String[] args) {
        
          int m = 2;
        int n = 3;
        int[][] indices = {
            {0, 1},
            {1, 1}
        };

        int [] row = new int[m];
        int [] column = new int[n];

        for(int a[] : indices){
            row[a[0]] += 1;
            column[a[1]] += 1;
        }
        for(int i =0; i<m; i++){
            
        }

}
}
