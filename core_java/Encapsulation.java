
class Student {

    private String name;
    private int age;

    // Getter and setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter methods for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        Student student = new Student();
        //student.name = "John"; // Error: name has private access in Student
        //student.age = 20; // Error: age has private access in Student

        // To access the private fields, we need to use getter and setter methods
        // For example:
        // student.setName("John");
        // student.setAge(20);
        // System.out.println("Student Name: " + student.getName());
        // System.out.println("Student Age: " + student.getAge());
        //Encapsulation is the process of hiding the internal details of an object and only exposing a public interface to interact with it. It is achieved by using access modifiers (private, protected, public) to restrict access to the fields and methods of a class. In the above example, the fields
        // name and age are private, which means they cannot be accessed directly from outside the Student class. Instead, we provide public getter and setter methods to allow controlled access to these fields. This helps to protect the integrity of the data and prevents unauthorized access or modification.
        student.setName("John");
        student.setAge(20);
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
    }

}
