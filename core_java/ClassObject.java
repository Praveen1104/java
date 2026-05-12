
class Calculator {

    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}

public class ClassObject {

    public static void main(String[] args) {
        // Creating an object of the Calculator class
        Calculator calc = new Calculator();
        // Calling the add method of the Calculator class
        int result = calc.add(5, 10);
        System.out.println(result);
    }
}
