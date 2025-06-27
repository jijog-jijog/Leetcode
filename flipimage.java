import java.util.Arrays;

public class flipimage {
    public static void main(String[] args) {
        int [][] image = {{1,1,0},{1,0,1},{0,0,0}};

        for(int i =0; i<image.length; i++){
            for(int j= image[i].length-1; j>=0; j--){
                System.out.println(Arrays.toString(image[j]));
            }
        }


        // for(int i = image.length - 1; i >= 0; i--){
        //      System.out.println(Arrays.toString(image[i])); 
        // }


    //     for(int[] a : image){
    //        System.out.println(Arrays.toString(a)); 
    //     }
    }
    
}
