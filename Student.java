public class Student extends Person {

    /*String name;
    int age;
    double  gpa;
    boolean isEnrolled;

    Student(String name,int age,double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }
    void study(){
        System.out.println(this.name + " is studying!");
    }*/
    double gpa;

    Student(String first, String last, double gpa) {
        super(first, last);
        this.gpa = gpa;

    }

    void showGpa() {
        System.out.println(first + " " + last + "'s GPA is: " + gpa);
    }

}
