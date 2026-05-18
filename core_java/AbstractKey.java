
abstract class car {

    // Abstract method (no implementation)
    public abstract void start();

    public abstract void accelerate();

    // Concrete method (has implementation)
    public void stop() {
        System.out.println("Car stopped.");
    }
}

abstract class sedan extends car {

    @Override
    public void start() {
        System.out.println("Sedan started.");
    }

    public void accelerate() {
        System.out.println("Sedan is accelerating.");
    }
}

class tesla extends sedan {

    @Override
    public void start() {
        System.out.println("Tesla started.");
    }
}

public class AbstractKey {

    // Abstract class is a class that cannot be instantiated and it is used to provide a base class for other classes to inherit from and it can contain abstract methods which are methods without a body and must be implemented by the subclasses and it can also contain concrete methods which are methods with a body and can be inherited by the subclasses
    // Abstract class is declared using the abstract keyword and it can have constructors and it can also
    public static void main(String[] args) {
        tesla myCar = new tesla();
        myCar.start(); // Calls the start method of tesla class
        myCar.accelerate(); // Calls the accelerate method of sedan class
        myCar.stop(); // Calls the stop method of car class
    }
}
