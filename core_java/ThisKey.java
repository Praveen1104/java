
class A {
//1. To Refer Current Class Instance Variables

    int x = 10;

    public A() {
        System.out.println("Constructor of class A is created");
    }

    public A(int x) {
        System.err.println("x in A: " + x);
    }

    public void display() {
        int x = 20;
        System.out.println("x in display method: " + x); // Refers to the local variable x
        System.out.println("x in class A: " + this.x); // Refers to the instance variable x using this keyword
    }
}

//2. To Invoke Current Class Constructor
class B {

    int x;

    public B() {
        this(10); // Calls the parameterized constructor of class B
        System.out.println("Constructor of class B is created");
    }

    public B(int x) {
        this.x = x; // Assigns the parameter x to the instance variable x using this keyword
        System.out.println("Constructor of class B with parameter is created");
    }

}

//3. To Return the Current Class Instance 
class C {

    int x = 50;

    public C() {
        System.out.println("Constructor of class C is created");
    }

    public C(int x) {
        this.x = x;
        System.out.println("Constructor of class C with parameter is created");
    }

    public C returnInstance() {
        return this; // Returns the current instance of class C
    }
}

//4. As a Method Parameter
class D {

    int a = 10;
    int b = 20;

    void display(D obj) {
        System.out.println("a = " + obj.a
                + "  b = " + obj.b);
    }

    // Method that returns current class instance
    void get() {
        display(this);
    }
}

//5. To Invoke the Current Class Method 
class E {

    void display() {
        this.show(); // Calls the show method of class E using this keyword
        System.out.println("This is class E");
    }

    void show() {
        this.display(); // Calls the display method of class E using this keyword
    }
}

public class ThisKey {

    public static void main(String[] args) {
        // The this keyword in Java is a reference variable that refers
        // to the current object and it is used to refer to the current instance of 
        //the class and it can be used to access the members (fields and methods) of the current class, 
        //to call the constructor of the current class, and to differentiate between the members of the current class and the parameters of a method or constructor when they have the same name
        // It is commonly used in constructors and methods to refer to the current object and to resolve naming conflicts between instance variables and parameters
        A a = new A(10);
        a.display();
        B b = new B();
        C c1 = new C(50);
        C c2 = c1.returnInstance();
        D d = new D();
        d.get();
        E e = new E();
        e.display();
    }
}
