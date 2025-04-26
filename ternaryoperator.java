
public class ternaryoperator {
    public static void main(String[] args) {

        int score = 55;

        /*if(score >= 60){

            System.out.println("PASS");

        }
        else{

            System.out.println("FAIL");

        }*/

        String passOrFail = (score >= 60) ? "PASS" : "FAIL";

        System.out.println(passOrFail);


    }
}
