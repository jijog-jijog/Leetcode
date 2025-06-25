import java.util.*;
public class sumof1darray {
  public static void main(String[] args) {
      int [] nums = {1,2,3,4};
    int[] ans = new int[nums.length];

    int runningSum = 0;
    for(int i = 0; i < nums.length; i++){
        runningSum = runningSum + nums[i];
        ans[i] = runningSum;
      
    }
    System.out.print(Arrays.toString(ans));


  }
 
}
