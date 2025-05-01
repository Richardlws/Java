public class sup {
    public static void main(String[] args) {
        Person person1 = new Person("Tom", "Riddle");
        person1.showName();
        Student student = new Student("Harry","Potter",3.3);
        Employee employee = new Employee("Rubeus", "Hagrid", 50000);
        student.showName();
        student.showGpa();
        employee.showSalary();
    }
}
