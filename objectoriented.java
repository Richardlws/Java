
import java.util.Random;
import java.util.Scanner;
public class objectoriented {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Car car1 = new Car();

        /*System.out.println(car.name);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);

        car.start();
        car.stop();
        car.drive();
        car.brake();*/

        Car car2 = new Car();
        System.out.println(car1.name+" "+car1.model);
        System.out.println(car2.name+" "+car2.model);



    }
}

