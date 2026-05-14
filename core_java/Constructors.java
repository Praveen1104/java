
class Student {

    String name;
    int age;
    int mark;

    //constructor is a special method that is used to initialize the object and it is called when the object is created and it has the same name as the class and it does not have a return type
    //constructor can be overloaded and it can have parameters and it can be used to set the
    //initial values of the fields of the class
    Student(String name, int age, int mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    //default constructor is a constructor that does not have any parameters and it is provided by the compiler if no constructor is defined in the class and it initializes the fields to their default values (null for objects, 0 for numeric types, false for boolean)
    Student() {
        //default constructor
    }

    //copy constructor is a constructor that creates a new object by copying the fields of an existing object and it is used to create a new object that is a copy of an existing object
    Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.mark = student.mark;
    }

}

public class Constructors {

    public static void main(String[] args) {
        Student student1 = new Student("John", 20, 85);
        System.out.println("Student Name: " + student1.name);

        System.out.println("Student Age: " + student1.age);
        System.out.println("Student Mark: " + student1.mark);

        // Using default constructor
        Student student2 = new Student();
        System.out.println("Student Name: " + student2.name); // null
        System.out.println("Student Age: " + student2.age); // 0
        System.out.println("Student Mark: " + student2.mark); // 0

        // Using copy constructor
        Student student3 = new Student(student1);
        System.out.println("Student Name: " + student3.name); // John
        System.out.println("Student Age: " + student3.age); // 20
        System.out.println("Student Mark: " + student3.mark); // 85
    }
}
