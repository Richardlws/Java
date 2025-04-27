import javax.xml.namespace.QName;
import java.util.Scanner;
public class methods {
    public static void main(String[] args){
        String name = "Bro";
        int age = 21;

        for (int i = 0;i<3;i++) {
            happyBirthday(name,age);
        }
    }
    static void happyBirthday(String name,int age){
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n",name);
        System.out.printf("You are %d years old\n",age);
        System.out.println("Happy Birthday to you!\n");
    }
}
