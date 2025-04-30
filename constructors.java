public class constructors {
    public static void main(String[] args){

        Student student1 = new Student("Spongebob",30,3.2);
        Student student2 = new Student("Patrick",34,1.5);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);

    }
}
