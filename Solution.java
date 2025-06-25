import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Solution {
    public static void main(String[] args) {
        int [] candies = {2,3,5,1,3};
        int extraCandies = 3;
        // int [] arr = new int[candies.length];
        List<Boolean> setc = new ArrayList<>(Collections.nCopies(candies.length, false));

        int max = candies[0];
        for(int val : candies){
            if ((val > max)) {
                max = val;
            }
        }

        for(int i = 0; i<candies.length; i++){
            if (candies[i] + extraCandies >= max) {
                setc.set(i, true);
            }
        }
        for(boolean an : setc){
            System.out.println(an);
        }
      
    }
    
}