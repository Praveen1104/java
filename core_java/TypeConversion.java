
class TypeConversion {

    public static void main(String[] args) {
        // Implicit Type Conversion (Widening)-automatic type conversion
        int num1 = 10;
        double num2 = num1; // int to double
        System.out.println("Implicit Type Conversion: " + num2);

        // Explicit Type Conversion (Narrowing)-manual type conversion
        System.out.println("Explicit Type Conversion:");
        double num3 = 20.5;
        long num4 = (long) num3;
        int num5 = (int) num4;

        System.out.println("Double value: " + num3);
        System.out.println("Long value after explicit conversion: " + num4);
        System.out.println("Int value after explicit conversion: " + num5);

//type promotion in expressions
        System.out.println("Type Promotion in Expressions:");

        byte a = 100;
        byte b = 120;
        int result = a + b;
        System.out.println("Result of byte addition (implicit conversion to int): " + result);
    }
}
