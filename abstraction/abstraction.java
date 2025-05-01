package abstraction;

public class abstraction {
    public static void main(String[] args){

        //Shape shape=new Shape();
        Circle circle = new Circle(6);
        Triangle triangle = new Triangle(3,4);
        Rectangle rectangle = new Rectangle(4,5);

        System.out.printf("%.2f\n",circle.area());
        System.out.printf("%.2f\n",triangle.area());
        System.out.printf("%.2f\n",rectangle.area());
        //circle.display();
        //rectangle.display();
        //triangle.display();
    }
}
