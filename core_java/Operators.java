
public class Operators {

    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a > b: " + (a > b)); // Greater than
        System.out.println("a < b: " + (a < b)); // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x)); // Logical NOT

        // Assignment Operators
        int c = 10;
        System.out.println("\nAssignment Operators:");
        c += 5; // c = c + 5
        System.out.println("c += 5: " + c);

        // Increment and Decrement Operators
        int d = 10;
        System.out.println("\nIncrement and Decrement Operators:");
        System.out.println("d++: " + (d++)); // Post-increment
        System.out.println("d: " + d); // d is now 11
        System.out.println("++d: " + (++d)); // Pre-increment
        System.out.println("d: " + d); // d is now 12
        System.out.println("d--: " + (d--)); // Post-decrement
        System.out.println("d: " + d); // d is now 11

        // Ternary Operator
        int e = 20;
        System.out.println("\nTernary Operator:");
        String result = (e > 15) ? "Greater than 15" : "Less than or equal to 15";
        System.out.println("e > 15 ? " + result);

        // Bitwise Operators
        int f = 5; // 0101 in binary    
        int g = 3; // 0011 in binary
        System.out.println("\nBitwise Operators:");
        System.out.println("f & g: " + (f & g)); // Bitwise AND
        System.out.println("f | g: " + (f | g)); // Bitwise OR
        System.out.println("f ^ g: " + (f ^ g)); // Bitwise XOR
        System.out.println("~f: " + (~f)); // Bitwise NOT
    }
}
