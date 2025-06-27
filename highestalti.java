import java.util.ArrayList;

public class highestalti {
    public static void main(String[] args) {
        
    int [] gain = {-4,-3,-2,-1,4,3,2};
    ArrayList<Integer> list = new ArrayList<>();

    int gaini = 0;
    int n = 0;
    
    list.add(0);
    for(int i =0; i<gain.length; i++){
         gaini = gain[i]; 
        n = gaini + n;
        list.add(n);   
    }
    int max = list.get(0);
    for(int i=0 ; i<list.size(); i++){
        if (list.get(i) > max) {
            max = list.get(i);
        }
       
    }
    System.out.println(max);
    
    for(Integer list2 : list){
        System.out.println(list2);
    }
    }
}
