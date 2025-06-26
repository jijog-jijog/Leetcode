import java.lang.reflect.Array;

public class smallerthencurrentnumber {
    public static void main(String[] args) {
        int [] nums = {8,1,2,2,3};
        int [] arr = new int[nums.length];

    
        for(int i =0; i<nums.length; i++){
            int count = 0;
            for(int j=0; j<nums.length; j++){
                
                if ((nums[j] < nums[i])) {
                    count = count+1;
                    arr[i] = count;
                }
            }
        }
    for(int ar : arr){
        System.out.println(ar);
    }
    }
}
