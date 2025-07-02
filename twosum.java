import java.util.Arrays;

public class twosum {
    public static void main(String[] args) {
        
        int [] nums = {2,7,11,15};
        int [] res = new int[nums.length];
        int target = 9;
        
        for(int i=0; i<nums.length; i++){
           for(int j=0; j<nums.length; j++){
            if (nums[i]+nums[j] == target) {
                    res[0] = i;
                    res[0] = j;
                }
           }
        }
    for(int a : res){
        System.out.println(a);
    }
    }
}
