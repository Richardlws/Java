public class overloadedmethods {
    public static void main(String[] args) {

        //System.out.println(add(1, 2, 3, 4));
        String pizza = bakePizza("flat bread", "mozzarella","pepperoni");
        System.out.println(pizza);

    }

    /*
    static double add(double a, double b) {
        return a + b;
    }

    static double add(double a, double b, double c) {
        return a + b + c;
    }

    static double add(double a, double b, double c, double d) {
        return a + b + c + d;
    }*/
    static String bakePizza(String bread) {
        return bread + " Pizza";
    }

    static String bakePizza(String bread, String cheese) {
        return cheese + " " + bread + " Pizza";
    }

    static String bakePizza(String bread, String cheese, String topping) {
        return topping + " " + cheese + " " + bread + " Pizza";
    }


}
