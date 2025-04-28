import java.util.Scanner;

public class twodarrays {
    public static void main(String[] args) {
        /*
        //String[] fruits = {"apple","orange","banana"};
        //String[] vegetables = {"potato","onion","carrot"};
        //String[] meats ={"chicken","pork","beef","fish"};

        String[][] groceries = { {"apple","orange","banana"},
                                 {"potato","onion","carrot"},
                                 {"chicken","pork","beef","fish"}};
        //System.out.println(groceries[2][3]);
        groceries[0][0]="pineapple";
        groceries[1][0]="celery";
        groceries[2][1]="eggs";



        for(String[] foods : groceries){
            for(String food : foods){
                System.out.print(food +" ");
            }
            //System.out.print(foods[1]+" ");
            System.out.print("\n");
        }*/
        char[][] telephone = {{'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}};
        for (char[] row : telephone) {
            for (char number : row) {
                System.out.print(number + " ");
            }
            System.out.print("\n");
        }
    }
}
