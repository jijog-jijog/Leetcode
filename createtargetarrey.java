public class createtargetarrey {
    public static void main(String[] args) {
        int [] nums = {0,1,2,3,4};
        int [] index = {0,1,2,2,1};
        int [] arr = new int[nums.length];
        
        int count = 0;
        for(int i =0; i<nums.length; i++){
            for(int j =count; j>index[i]; j--){
                 arr[j] = arr[j-1];
            };

            arr[index[i]] = nums[i];
            count += 1;
        }
        
        for(int im : arr){
            System.out.println(im);
        }
        // System.out.println("Count is"+count);
    
    }

}
