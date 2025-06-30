public class evendigit1295opti {
    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896};

        int count = 0;
         int value = 0;
        for(int a : nums){
            while ((a<0)) {
                value++;
                a = a/10;
            }
        }
         if ((value % 2 == 0)) {
                count++;
            }
    System.out.println(count);

    }
}
