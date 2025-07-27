public class suffle {
    public static void main(String[] args) {
         int [] nums = {1,2,3,4,5,6};
         int n = 3;
        
         int[] ans = new int[nums.length];

         for(int i = 0; i<n; i++){
            ans[i*2] = nums[i];
            ans[i*2+1] = nums[n+i];
         }

         for(int arr : ans){
            System.out.println(arr);
         }
        

        

    }
}
