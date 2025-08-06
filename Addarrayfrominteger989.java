public class Addarrayfrominteger989 {
    public static void main(String[] args) {
        int[] num = {1,2,0,0};
        int [] out = new int[num.length];
        int k = 34;
        int count = 0;
        for(int a : num){
            count = count + a;
        }
        int result = count+k;
        System.out.println(result);
    }

}
