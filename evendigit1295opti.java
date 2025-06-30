public class evendigit1295opti {
    public static void main(String[] args) {
        int [] nums = {555,901,482,1771};

        int count = 0;
        for(int a : nums){
            int digitcount = String.valueOf(Math.abs(a)).length();
            if(digitcount % 2 == 0){
                count++;
            }
        }
    System.out.println(count);

    }
}
