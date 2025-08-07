public class Arraypalin {
    public static void main(String[] args) {
//        System.out.println("Hello ");
           int[] nums = {5,0,1,2,3,4};
           int[] ans = new int[nums.length];

            for (int i = 0; i < nums.length; i++) {
                 ans[i] = nums[nums[i]];
          }

          for (int val : ans) {
            System.out.print(val);
          }
         
     
        //     System.out.println((ans[i]));
            // return (ans[i]);
            
        }
    }

