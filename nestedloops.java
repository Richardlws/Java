import java.util.Scanner;

public class nestedloops {
    public static void main(String[] args) {

        /*for (int i = 1;i<=9;i++){
            for(int j = 1;j<=3;j++){
                System.out.print(j);
            }
            System.out.println();
        }*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the symbol to use: ");
        char symbol = scanner.nextLine().charAt(0);
        System.out.print("Please enter the # of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Please enter the # of columns: ");
        int columns = scanner.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol);
            }
            System.out.print("\n");
        }
        scanner.close();
    }
}
