public class Shufflearray {
    public static void main(String[] args) {
        //code is wrong
        int [] nums = {1,2,3,4,5,6};
        int [] val1 = new int[nums.length/2];
        int [] val2 = new int[nums.length/2];
        int [] ans = new int[nums.length];

        for(int i = 0; i< nums.length/2; i++){
               val1[i] = nums[i];
        }
       
        for(int j = nums.length/2; j<nums.length; j++ ){
            val2[j] = nums[j];
        }
        for(int i =0; i<val1.length; i++){
            val1[i] = ans[i*2+1];
            // val2[i] = ans[i];

        }
        
        for(int arr : ans){
            System.out.println(arr);
        }
    }
}
