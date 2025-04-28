import java.util.Scanner;

public class searcharray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //int[] numbers = {1,9,2,8,3,5,4};
        String[] fruits = {"apple","orange","banana"};
        System.out.print("Enter a fruit to search for: ");
        String target = scanner.nextLine();
        boolean isFound = false;

        for(int i = 0;i<fruits.length;i++){
            if(fruits[i].equals(target)){
                System.out.printf("%s found at index: %d\n",fruits[i],i);
                isFound = true;
                break;
            }
        }
        if(!isFound){

            System.out.println("Fruit not found in the array");

        }
        scanner.close();
    }
}
