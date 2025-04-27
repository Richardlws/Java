import java.util.Scanner;
public class methods {
    public static void main(String[] args){

        String name = "Bro";
        int age = 21;

        for (int i = 0;i<3;i++) {
            happyBirthday(name,age);
        }
        System.out.println(square(3));
        System.out.println(cube(3));
    }
    static void happyBirthday(String name,int age){
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n",name);
        System.out.printf("You are %d years old\n",age);
        System.out.println("Happy Birthday to you!\n");
    }
    static double square(double number){
        return number * number;
    }
    static double cube(double number){
        return number*number*number;
    }
}
