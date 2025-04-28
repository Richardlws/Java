public class varargs {
    public static void main(String[] args) {

        System.out.println(add(1, 2, 3, 4));
        System.out.printf("%.2f",average(1,2,3,4,5,6,7,8,9,10));

    }

    static int add(int... numbers) {

        //System.out.println(numbers);
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        return sum;

    }

    static double average(double... numbers) {
        double average = 0;
        double sum = 0;
        if(numbers.length==0){
            return 0;
        }
        for (double number : numbers) {
            sum += number;
            average = sum/numbers.length;

        }
        return average;
    }
}
