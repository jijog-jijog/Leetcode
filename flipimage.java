import java.util.Arrays;

public class flipimage {
    public static void main(String[] args) {
        int [][] image = {{1,1,0},
                          {1,0,1},
                          {1,0,0}};
        int [][] fliped = new int[image.length][];

       for(int i=0; i<image.length; i++){
           fliped[i] = new int[image[i].length];
        for(int l =0, r=image[i].length-1; l <= r; l++, r--){  //not int for the second varibale and ;<-- this symbol plus , comma
         
            int left = image[i][l] ^ 1;
            int right = image[i][r] ^ 1;

            fliped[i][r] = left;
            fliped[i][l] = right;
        }
       }
    for(int a[] : fliped){
        System.err.println(Arrays.toString(a));
    }
    }
    
}
