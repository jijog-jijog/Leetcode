public class nuniqueintegersum {
    public static void main(String[] args) {
        int n = 5;
        int[] set = new int[n];
        for(int i=0; i<n; i++){
            for(int j=n/2+1; j<n; j++){
                set[i] = i+1;
                set[j] = j+5;
            }
        }
    for(int a : set){
        System.out.println(a);
    }
    }
}
