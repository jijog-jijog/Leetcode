public class nuniqueintegersum {
    public static void main(String[] args) {
        int n = 5;
        int[] set = new int[n];
        for(int i=0; i<n; i++){
            set[i] = -(i+1);
            set[n - i - 1] = i+1;
        }
        if (n%2 != 0) {
            set[n/2] = 0;
        }
    for(int a : set){
        System.out.println(a);
    }
    }
}
