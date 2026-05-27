
//throwable class has two main subclasses
//1. Exception class - it is used to handle exceptions that can be handled by the programmer
//2. Error class - it is used to handle errors that cannot be handled by the programmer
//Exception class has two main subclasses
//1.built-in exceptions - these are exceptions that are provided by the Java API and can be used by the programmer
//2. user-defined exceptions - these are exceptions that are created by the programmer to handle specific
//1. Checked exceptions - these are exceptions that are checked at compile time and must be handled by the programmer
//2. Unchecked exceptions - these are exceptions that are not checked at compile time and can
class MyException extends Exception {

    public MyException(String message) {
        super(message);
    }
}

class IOException extends Exception {

    public IOException(String message) {
        super(message);
    }
}

public class ExceptionH {

    //throw keyword is used to throw an exception explicitly
//throws keyword is used to declare an exception in the method signature
//it is used to indicate that a method may throw an exception and it is the responsibility of the caller to handle it
    public static void m1() throws IOException {
        throw new IOException("This is a checked exception thrown from m1 method");

    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero" + e);
        } //finally block is used to execute a block of code regardless of whether an exception is thrown or not
        finally {
            System.out.println("This block will always execute");
        }

        //built-in exceptions
        try {
            int[] arr = new int[5];
            arr[10] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds" + e);
        }

        //user-defined exceptions
        try {
            throw new MyException("This is a user-defined exception");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        //unchecked exceptions
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception" + e);
        }

        //checked exceptions
        try {
            throw new IOException("This is a checked exception");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //throw keyword is used to throw an exception explicitly
        try {
            throw new MyException("This is a user-defined exception thrown using throw keyword");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        //throws keyword is used to declare an exception in the method signature
        //it is used to indicate that a method may throw an exception and it is the responsibility of the caller to handle it
        //if a method throws a checked exception, it must be handled by the caller or declared in the method signature using throws keyword
        try {
            m1();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
