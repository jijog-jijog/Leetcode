public class optihighati {
   public static void main(String[] args) {
     int [] gain = {-4,-3,-2,-1,4,3,2};

    int n =0;
    int max =0;
    for(int a : gain){
        n= n + a;
        max = n>max ? n : max;
    }
    System.out.println(max);
   }
}
