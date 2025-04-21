import java.util.Scanner;

public class shoppingcartprogram {
    public static void main(String[] args) {
        // SHOPPING CART PROGRAM
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();
        System.out.println(item);


        scanner.close();


    }
}
