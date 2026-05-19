//member inner class

class A {

    //member inner class is a class that is defined inside another class and it can be used to logically group classes that are only used in one place and it can also be used to access the members of the outer class and it can also be used to hide the implementation details of the inner class from the outside world and it can also be used to create anonymous classes which are classes without a name and they are used to implement interfaces or extend classes in a concise way and they are often used in event handling and they can also be used to create local classes which are classes defined inside a method and they are only accessible within that method and they can also be used to create static nested classes which are classes defined inside another class with the static keyword and they are not associated with an instance of the outer class and they can only access the static members of the outer class
    class B {

        void display() {
            System.out.println("Hello from inner class");
        }
    }
}

// Method-Local Inner Class
class C {

    void method() {
        class D {

            void display() {
                System.out.println("Hello from method-local inner class");
            }
        }
        D d = new D();
        d.display();
    }
}

// Static Nested Classes
//A static nested class is a static class defined inside another class.
// It does not have access 
//to instance members of the outer class but can access static members.
class E {

    static class F {

        void display() {
            System.out.println("Hello from static nested class");
        }
    }
}
// Anonymous Inner Classes 

class Demo {

    void show() {
        System.out.println("Inside Demo's show method");
    }
}

public class Inner {

    // Inner class is a class that is defined inside another class and it can be used to logically group classes that are only used in one place and it can also be used to access the members of the outer class and it can also be used to hide the implementation details of the inner class from the outside world and it can also be used to create anonymous classes which are classes without a name and they are used to implement interfaces or extend classes in a concise way and they are often used in event handling and they can also be used to create local classes which are classes defined inside a method and they are only accessible within that method and they can also be used to create static nested classes which are classes defined inside another class with the static keyword and they are not associated with an instance of the outer class and they can only access the static members of the outer class
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        b.display();
        C c = new C();
        c.method();
        E.F f = new E.F();
        f.display();
        // Anonymous Inner Class
        Demo demo = new Demo() {
            @Override
            void show() {
                System.out.println("Hello from anonymous inner class");
            }
        };
        demo.show();
    }
}
