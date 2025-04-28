public class array {
    public static void main(String[] args) {

        String[] fruits = {"apple", "orange", "banana", "coconut"};
        //fruit[0]= "pineapple";
        int numofFruits = fruits.length;

        //System.out.println(numofFruits);
        //for (int i = 0; i < numofFruits; i++) {
            //System.out.println(fruits[i]);
            //System.out.print(fruits[i] + " ");
        for(String fruit : fruits){
            System.out.println(fruit);
        }

    }
}
