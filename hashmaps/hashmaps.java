package hashmaps;

import java.util.HashMap;

public class hashmaps {
    public static void main(String[] args){
        HashMap<String,Double> map = new HashMap<>();
        map.put("apple",0.5);
        map.put("orange",0.75);
        map.put("banana",0.25);
        map.put("coconut",1.00);
        //System.out.println(map);
        //map.remove("apple");

        //map.put("orange",1000000.0);

        //System.out.println(map);
        //System.out.println(map.get("coconut"));

        //System.out.println(map.containsKey("pineapple"));

        if(map.containsKey("pineapple")){
            System.out.println(map.get("apple"));
        }
        else{
            System.out.println("Key not found");
        }



    }
}
