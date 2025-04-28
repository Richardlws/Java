import java.util.Scanner;
public class inputarrays {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

       String[] foods = new String[3];

       for(int i = 0;i<foods.length;i++){
           System.out.print("Enter a food: ");
           foods[i]= scanner.nextLine();
       }

        //foods[0]="pizza";
        //foods[1]="taco";
        //foods[2]="hamburger";

        for(String food : foods){
            System.out.println(food);
        }

        System.out.println(foods.length);

        scanner.close();
    }
}
