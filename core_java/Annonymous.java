
class Test {

    Test() {
        System.out.println("Constructor of Test class is Creadted");
    }

    public void Test() {
        System.out.println("Method of Test class");
    }
}

public class Annonymous {

    public static void main(String[] args) {
        // Anonymous class is a class that is defined without a name and it is used to create an instance of a class that implements an interface or extends a class without having to create a separate named class and 
        //it is often used for event handling, callbacks, and for creating simple implementations of interfaces or abstract classes
        //you can use it only once and it cannot have a constructor because it does not have a name and it is defined and instantiated in a single expression
        new Test();
    }
}
