
//final- variable, method and class
//method and class
final class A {

    public final void display() {
        System.out.println("This is a final method in class B.");
    }

}

class B {

    public final void display() {
        System.out.println("This is a final class A.");
    }

}

class C extends B {

    // This method cannot be overridden because it is declared as final in class A
    // public void display() {
    //     System.out.println("This is an attempt to override a final method.");
    // }
}

public class FinalKey {

    public static void main(String[] args) {
        final int x = 10; // Declares a final variable x and initializes it with the value 10
        // x = 20; // This line would cause a compile-time error because x is final and cannot be reassigned
        System.out.println("The value of x is: " + x);
        A a = new A();
        a.display(); // Calls the display method of class A
    }
}
