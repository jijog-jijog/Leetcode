import java.util.Arrays;

public class Richestcustomer {
    public static void main(String[] args) {
        
        int [] [] accounts = {{1,3,5,6,8,2,9},{4,9,7,5,3},{3,4,9,7,6}};

        int maxval = 0;
        for (int[] arr : accounts) {
             System.out.println(Arrays.toString(arr));
            int rowSum = 0;
            for (int num : arr) {
                rowSum = rowSum + num;
                if(rowSum > maxval){
                    maxval = rowSum;
                }             

            }  // System.out.println(rowSum);
        }
         System.out.println(maxval);
    }
}
