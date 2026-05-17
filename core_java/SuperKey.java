//every calss has Onject class as its parent class and it is the root 
//class of the Java class hierarchy and it provides some basic 
//methods that are inherited by all classes in Java such as 
//toString(), equals(), hashCode(), getClass(), wait(), notify(), notifyAll() etc. and it is defined in the java.lang package and it is automatically imported by every Java program

class A extends Object {

    int x = 10;

    public A() {
        super(); // Calls the constructor of the Object class (the parent class of A)
        System.out.println("Constructor of class A is created");
    }

    public A(int x) {
        super(); // Calls the constructor of the Object class
        System.err.println("x in A: " + x);
    }

    void display() {
        System.out.println("This is class A");
    }

}

class B extends A {

    int x = 20;

    public B() {
        super(); // Calls the constructor of class A
        System.out.println("Constructor of class B is created");
    }

    public B(int x) {
        super(x); // Calls the constructor of class A with parameter
        System.out.println("Constructor of class B with parameter is created");
    }

    void display() {

        System.out.println("This is class B");
    }

    void show() {
        display(); // Calls B's display method
        super.display(); // Calls A's display method
        System.out.println("Value of x in B: " + x); // Refers to B's x
        System.out.println("Value of x in A: " + super.x); // Refers to A's x
    }
}

public class SuperKey {

    public static void main(String[] args) {
        // The super keyword in Java is a reference variable that is used to refer to the immediate parent class of the current object and it can be used to access the members (fields and methods) of the parent class, to call the constructor of the parent class, and to differentiate between the members of the parent class and the members of the current class when they have the same name
        // It is commonly used in inheritance to allow a subclass to access and utilize the properties and behaviors of its superclass while also providing its own specific implementations or extensions
        B b = new B(30);
        b.show();
    }
}
