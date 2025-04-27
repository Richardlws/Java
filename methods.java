import java.util.Scanner;
public class methods {
    public static void main(String[] args){

        String name = "Bro";
        int age = 11;

        for (int i = 0;i<3;i++) {
            happyBirthday(name,age);
        }
        System.out.println(square(3));
        System.out.println(cube(3));
        System.out.println(getFullName("Spongebob", "Squarepants"));
        if(ageCheck(age)){
            System.out.println("You may sign up!");
        }
        else{
            System.out.println("You must 18+ to sign up");
        }
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
    static String getFullName(String first,String last){
        return first + " " +last;
    }
    static boolean ageCheck(int age){
        if(age>18){
            return true;
        }
        else{
            return false;
        }

    }

}
