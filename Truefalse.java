public class Truefalse {
    public static void main(String[] args) {
        int [] candies = {4,2,1,1,2};
        int [] newarr = new int[candies.length];
        boolean [] setarr = new boolean[candies.length];
        int extraCandies = 10;

        for(int i = 0; i < candies.length; i++ ){
            int max = candies[i] + extraCandies;
            newarr[i] = max;
        }
        
        for(int i = 0; i<=candies.length-1; i++){
            for(int j =0; j<=candies.length-1; j++){
                  if (newarr[i] < newarr[j]) {
                    setarr[j] = true;
                  }
            }
            }
                    
        
       
    
    for(boolean arr : setarr){
        System.out.println(arr);
    }
}
}
