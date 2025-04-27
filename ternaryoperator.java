
public class ternaryoperator {
    public static void main(String[] args) {

        int score = 55;
        int number = 3;
        int hours = 13;
        int income = 60000;
        double taxRate = (income>=40000)? 0.25:0.15;
        /*if(score >= 60){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }*/
        String passOrFail = (score >= 60) ? "PASS" : "FAIL";
        System.out.println(passOrFail);
        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
        System.out.println(evenOrOdd);
        String timeOfDay = (hours < 12) ? "A.M.":"P.M.";
        System.out.println(timeOfDay);
        System.out.println(taxRate);
    }
}
