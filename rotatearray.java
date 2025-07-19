import java.util.Arrays;

public class rotatearray {
    public static void main(String[] args) {
        
        int[] nums = {1,2,3,4,5,6,7};
        int[] arr = new int[nums.length];
        int k =3;
        int i = 0;
        int l = 0;

        while (k > 0) {
            if (k > 0) {
                arr[i] = nums[nums.length-i-1];
                 i++;
                 k--;
            }else{

                if(l<=k && k<=k*2){
                     arr[k] = nums[l];
                     k++;
                     l++;
                }
               
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
