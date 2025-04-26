import java.util.Scanner;

public class enhancedswitch {
    public static void main(String[] args){

        //String day = "Saturday";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine();

        /*switch(day){
            case "Monday" -> System.out.println("It is a weekday 😫");
            case "Tuesday" -> System.out.println("It is a weekday 😫");
            case "Wednesday" -> System.out.println("It is a weekday 😫");
            case "Thursday" -> System.out.println("It is a weekday 😫");
            case "Friday" -> System.out.println("It is a weekday 😫");
            case "Saturday" -> System.out.println("It is a weekend 😀😀😀");
            case "Sunday" -> System.out.println("It is a weekend 😀😀😀");
            default -> System.out.println(day + "is not a day");
        }*/

        switch(day){
            case "Monday" ,"Tuesday","Wednesday","Thursday","Friday"-> System.out.println("It is a weekday \uD83D\uDE2B");
            case "Saturday","Sunday"  -> System.out.println("It is a weekend 😀😀😀");
            default -> System.out.println(day + "is not a day");
        }
        scanner.close();

    }
}
