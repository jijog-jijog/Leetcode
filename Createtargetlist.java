import java.util.ArrayList;

public class Createtargetlist {
    public static void main(String[] args) {
        int [] nums = {0,1,2,3,4};
        int [] index = {0,1,2,2,1};
        int [] arr = new int[nums.length];
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            list.add(index[i], nums[i]);
        };
        for(int i =0; i<nums.length; i++){
            arr[i] = list.get(i);
        }

    for(int ar : arr){
        System.out.println(ar);
    }    

    }
}
