package generics;

import java.util.ArrayList;

public class generics {
    public static void main(String[] args){
        /*ArrayList<String> fruits= new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");

        Box<String> box = new Box<>();

        box.setItem("banana");

        System.out.println(box.getItem());*/

        Product<String,Double>product1 = new Product<>("apple",0.50);
        Product<String,Integer>product2 = new Product<>("ticket",15);
        //System.out.println(product.getItem());
        //System.out.println(product.getPrice());
        System.out.println(product2.getPrice());
    }
}
