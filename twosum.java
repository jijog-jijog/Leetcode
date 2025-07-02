import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class twosum {
    public static void main(String[] args) {
        
        int [] nums = {3,2,4};
        List <Integer> set = new ArrayList<>();
        int target = 6;
        
        for(int i=0; i<nums.length; i++){
           for(int j=i+1; j<nums.length; j++){
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
