import java.util.*;;
public class maxvaltrue {
    

    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        List<Boolean> setc = new ArrayList<>(Collections.nCopies(candies.length, false));

        // Step 1: Find the maximum in the original array
        int max = candies[0];
        for (int val : candies) {
            if (val > max) {
                max = val;
            }
        }

        // Step 2: Check for each child
        // for (int i = 0; i < candies.length; i++) {
        //     if (candies[i] + extraCandies >= max) {
        //         setc.set(i, true);
        //     }
        // }

        // Step 3: Print result
        // for (boolean val : setc) {
        //     System.out.println(val);
        // }

        for(int val : candies){
            System.out.println(val);
        }
    }
}

