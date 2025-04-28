public class array {
    public static void main(String[] args) {

        String[] fruit = {"apple", "orange", "banana", "coconut"};
        //fruit[0]= "pineapple";
        int numofFruits = fruit.length;

        //System.out.println(numofFruits);
        for (int i = 0; i < numofFruits; i++) {
            System.out.println(fruit[i]);
        }
    }
}
