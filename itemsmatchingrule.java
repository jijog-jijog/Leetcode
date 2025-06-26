public class itemsmatchingrule {
    public static void main(String[] args) {
        String[][] items = {{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}};
         
        String rulekey = "type";
        String rulevalue = "phone";

        int indexvalue = 0;
        if (rulekey.equals("type")) {
            indexvalue = 0;
        }else if (rulekey.equals("color")) {
            indexvalue = 1;
        }else if (rulekey.equals("name")) {
            indexvalue = 2;
            
        }

        int count =0;
        for(int i=0; i<items.length; i++){
            if (items[i][indexvalue].equals(rulevalue)) {
                count += 1;  
            }
        }
System.out.println(count);
        
          

    
    }

}
