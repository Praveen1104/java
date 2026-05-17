
class Calcilator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}

//single inheritance is a type of inheritance in which a subclass inherits from a single superclass and it is the most common type of inheritance in Java and it allows the subclass to reuse the code of the superclass and to add its own specific features and behaviors
class AdvancedCalculator extends Calcilator {

    public int multiply(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new IllegalArgumentException("Divisor cannot be zero.");
        }
    }
}

//multilevel inheritance is a type of inheritance in which a subclass inherits from a superclass, and then another subclass inherits from that subclass, creating a chain of inheritance and it allows for more complex relationships between classes and promotes code reusability across multiple levels of the class hierarchy
class ScientificCalculator extends AdvancedCalculator {

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
//hierarchical inheritance is a type of inheritance in which multiple subclasses inherit from a single superclass and it allows for the creation of multiple specialized classes that share common features and behaviors defined in the superclass, while also allowing each subclass to have its own unique features and behaviors

class BasicCalculator extends Calcilator {

    public int modulus(int a, int b) {
        return a % b;
    }
}

public class Inheritance {

    public static void main(String[] args) {
        // Inheritance is a fundamental object-oriented programming concept that allows a new class (called a subclass or child class) to inherit properties and behaviors (fields and methods) from an existing class (called a superclass or parent class). 
        // The subclass can also have its own additional fields and methods, and it can override the inherited methods to provide specific implementations. 
        // Inheritance promotes code reusability and establishes a natural hierarchical relationship between classes, making it easier to organize and manage code in larger applications.
        AdvancedCalculator advCalc = new AdvancedCalculator();
        System.out.println("Addition: " + advCalc.add(10, 5)); // Inherited method from Calcilator class
        System.out.println("Subtraction: " + advCalc.subtract(10, 5)); // Inherited method from Calcilator class
        System.out.println("Multiplication: " + advCalc.multiply(10, 5)); // Extended method from AdvancedCalculator class
        System.out.println("Division: " + advCalc.division(10, 5)); // Extended method from AdvancedCalculator class
    }
}
