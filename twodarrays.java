import java.util.Scanner;
public class twodarrays {
    public static void main(String[] args){

        String[] fruits = {"apple","orange","banana"};
        String[] vegetables = {"potato","onion","carrot"};
        String[] meats ={"chicken","pork","beef","fish"};

        String[][] groceries = {fruits,vegetables,meats};
        System.out.println(groceries[2][3]);


        for(String[] foods : groceries){
            for(String food : foods){
                System.out.print(food +" ");
            }
            //System.out.print(foods[1]+" ");
            System.out.printf("\n");
        }


    }
}
