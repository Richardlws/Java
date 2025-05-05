package arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arraylists {
    public static void main(String[] args) {
        /*ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(1);
        list.add(2);

        System.out.println(list);

        ArrayList<Double> list = new ArrayList<>();

        list.add(3.14);
        list.add(1.0);
        list.add(2.2);

        System.out.println(list);

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Coconut");

        //fruits.remove(0);
        //fruits.set(0,"Pineapple");


        //System.out.println(fruits.get(1));
        //System.out.println(fruits.size());

        //Collections.sort(fruits);

        //System.out.println(fruits);

        for(String fruit : fruits){
            System.out.println(fruit);
        }*/

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the # of food you would like: ");
        int numofFood = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <= numofFood; i++) {
            System.out.print("Enter food # " + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }
        System.out.println(foods);


        scanner.close();


    }
}
