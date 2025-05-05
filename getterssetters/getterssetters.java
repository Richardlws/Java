package getterssetters;

public class getterssetters {
    public static void main(String[] args){
        Car car = new Car("Charge","Yellow",10000);
        //car.model = "Corvette";

        car.setModel("Corvette");
        car.setColor("Blue");
        car.setPrice(-100);

        System.out.println(car.getColor()+" "+car.getModel()+" "+car.getPrice());
    }
}
