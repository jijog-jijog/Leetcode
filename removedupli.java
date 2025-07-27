
import java.util.Arrays;





class removedupli{
    public static void main(String[] args) {
        // int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] nums = {0,0,1,1,1,2,2,3,3,4,4,4,4,5};
        int i =0;

        for(int j=1; j<nums.length; j++){

            if (nums[i] != nums[j]) {

                i++;

                nums[i] = nums[j];

            }

        }

        System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 0, i+1)));
        
    }
}