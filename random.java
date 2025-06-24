public class random {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
         int [] ans = new int[nums.length];

        for(int i=1; i<nums.length; i++){
            ans[i] = nums[nums[i]];
        }

    }
}
