public class optimizedpangram {
    public static void main(String[] args) {
        
        String str = "hello";
        if (str.length() < 26) {
            System.out.println(false);
            return;
        }

        for(char i = 'a'; i<= 'z'; i++){
            if (str.indexOf(i) < 0){
                System.out.println(i + " --> " + str.indexOf(i));
                return;
            }
        }
    System.out.println(true);
    }

}
