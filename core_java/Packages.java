import Package.One;
import Package.Two;

public class Packages extends One {
    public static void main(String[] args) {
        Packages packages = new Packages();
        int sum = packages.add(5, 10);
        System.out.println("Sum: " + sum); // Output: Sum: 15

        Two two = new Two();
        int product = two.multiply(5, 10);
        System.out.println("Product: " + product); // Output: Product: 50
    }

}
