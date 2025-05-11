package generics;

import java.util.ArrayList;

public class generics {
    public static void main(String[] args){
        /*ArrayList<String> fruits= new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");*/

        Box<String> box = new Box<>();

        box.setItem("banana");

        System.out.println(box.getItem());


    }
}
