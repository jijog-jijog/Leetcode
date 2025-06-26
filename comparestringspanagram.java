public class comparestringspanagram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpverthelazydog";
        boolean [] arr  = new boolean[26];
        
        for(int i=0; i<sentence.length(); i++){
            char ch = sentence.charAt(i);
            arr[ch - 'a']  = true;
        }

        boolean result = true;
        for(int i =0; i<26; i++){
            result = (!arr[i]) ? false : result;
        }
        System.out.println(result);
    }
}
