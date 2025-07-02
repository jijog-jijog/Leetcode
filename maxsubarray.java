public class maxsubarray {
    public static void main(String[] args) {
         int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));  
    }

    public static int maxSubArray(int[] nums) {
        int currSum = nums[0];  // current running sum
        int maxSum = nums[0];   // overall max sum

        for (int i = 1; i < nums.length; i++) {

            if (currSum + nums[i] > nums[i]) {
                currSum = currSum + nums[i];
            } else {
                currSum = nums[i];
            }

            if (currSum > maxSum) {
                maxSum = currSum;
            }
        }

        return maxSum;
    }
}
