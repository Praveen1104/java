
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking input from user
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        //file input 
        //try-with-resources is used to automatically close the resources after use
        try (Scanner fileScanner = new Scanner(new java.io.File("Input.java"))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
        } catch (java.io.FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
