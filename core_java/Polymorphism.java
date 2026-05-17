//Polymorphism is two types: Compile-time Polymorphism (Method Overloading) and Runtime Polymorphism (Method Overriding)
//1. Compile-time Polymorphism (Method Overloading)
// Method Overloading: Same method name with different parameters
//2. Runtime Polymorphism (Method Overriding)

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }

}

// Method overRiding: Same method name and parameters in parent and child class
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

class Elephant extends Animal {
    @Override
    void makeSound() {
        System.out.println("Elephant trumpets");
    }
}
// Method overLoading: Same method name with different parameters

//before overLoading
class CalculatorOne {
    int addOne(int a) {
        return a ;
    }
    int addTow(int a, int b) {
        return a + b ;
    }
    int addThree(int a, int b, int c) {
        return a + b + c ;
    }
}
class Calculator {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two doubles
    double add(double a, double b) {
        return a + b;
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        // Runtime Polymorphism (Method Overriding)
        Animal[] zoo = { new Dog(), new Cat(), new Elephant() };
        for (Animal animal : zoo) {
            animal.makeSound(); // Output: Dog barks, Cat meows, Elephant trumpets
        }

        // Compile-time Polymorphism (Method Overloading)
        Calculator calculator = new Calculator();
        System.out.println("Sum of 2 and 3: " + calculator.add(2, 3)); // Output: Sum of 2 and 3: 5
        System.out.println("Sum of 2, 3 and 4: " + calculator.add(2, 3, 4)); // Output: Sum of 2, 3 and 4: 9
        System.out.println("Sum of 2.5 and 3.5: " + calculator.add(2.5, 3.5)); // Output: Sum of 2.5 and 3.5: 6.0
    }
}
