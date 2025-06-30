import java.util.Arrays;

public class maxpopulationyr1854 {
    public static void main(String[] args) {

        int[][] logs =  {{1950,1961},{1960,1971},{1970,1981}};

        for (int i = 0; i < logs.length; i++) {
            int birth = logs[i][0];
            int death = logs[i][1] - 1;  // exclude the death year

            System.out.println( birth);
             System.out.println(death);
        }
    }
}

