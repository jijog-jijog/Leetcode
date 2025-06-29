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

        int count = 0;
        for(int i =0; i<m; i++ ){ 
            for(int j=0; j<n; j++){
                int rowee = row[i] + column[j];
                if (rowee %2 != 0) {
                    count++;
                }
            }
        }
    System.out.println(count);
}
}
