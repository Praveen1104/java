
class MyClass {

    static int staticVariable = 10;

    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    static {

        System.out.println("This is a static block. It is executed when the class is loaded.");
    }
}

public class Statics {

    public static void main(String[] args) {
        // Static variables are shared among all instances of a class and they are initialized only once when the class is loaded and they can be accessed using the class name without creating an object of the class
        // Static methods are methods that belong to the class rather than to any specific instance of the class and they can be called using the class name without creating an object of the class and they can only access static variables and call other static methods
        // Static blocks are blocks of code that are executed when the class is loaded and they are used to initialize static variables or to perform any other static initialization tasks

        System.out.println("Static variable: " + MyClass.staticVariable);
        MyClass.staticMethod();

        //camel casing is a naming convention in which the first letter of each word is capitalized except for the first word and it is used to improve the readability of the code and it is commonly used for class names, method names, and variable names in Java
        //class and interface names should be in camel case and should start with an uppercase letter and method and variable names should be in camel case and should start with a lowercase letter
        //constants are variables that are declared as final and they cannot be changed once they are initialized and they are often declared as static final to indicate that they are constants that belong to the class rather than to any specific instance of the class and they are typically named in uppercase letters with words separated by underscores to improve readability and to indicate that they are constants
        final int CONSTANT_VARIABLE = 100;

        //showMarks 
    }
}
