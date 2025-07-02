import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class twosum {
    public static void main(String[] args) {
        
        int [] nums = {2,7,11,15};
        List <Integer> set = new ArrayList<>();
        int target = 9;
        
        for(int i=0; i<nums.length; i++){
           for(int j=0; j<nums.length; j++){
            if (nums[i]+nums[j] == target) {
                  set.add(i);
                  set.add(j);
                  break;
                }
           }
        }
    for(int a : set){
        System.out.println(a);
    }
    }
}
