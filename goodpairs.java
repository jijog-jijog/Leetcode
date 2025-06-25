public class goodpairs {
    public static void main(String[] args) {
        int [] nums = {1,2,3};

        int count = 0;
        for(int i = 0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if (nums[i] == nums[j] && i<j) {
                    count= count+1;
                }
            }
        }
        System.out.println(count);
    }
}
