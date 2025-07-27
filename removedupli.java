
import java.util.ArrayList;
import java.util.List;

class removedupli{
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        List<Integer> arr = new ArrayList<>();
        
       int i =0;
       while (i<nums.length-1) {
        
        if (nums[i+1] < nums.length-1  && nums[i] != nums[i+1]) {
            arr.add(i);
        }else{
            i++;
        }
       }
       System.out.println(arr.toString());
    }
}