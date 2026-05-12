
class Overloading {
    // Method overloading allows us to have multiple methods with the same name but different parameters.

    public void display(int a) {
        System.out.println("Method with integer parameter: " + a);
    }
// Overloaded method with a different parameter type

    public void display(String str) {
        System.out.println("Method with string parameter: " + str);
    }

    //
    // Overloaded method with different number of parameters
    public void display(int a, String str) {
        System.out.println("Method with integer and string parameters: " + a + ", " + str);
    }

}

public class MethodOverLoading {

    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.display(10);
        obj.display("Hello, World!");
        obj.display(20, "Java");
    }
}
