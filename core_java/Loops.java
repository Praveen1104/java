public class Loops {
    public static void main(String[] args) {
        // for loop

        for (int i = 0; i < 10; i++) {
            System.out.println("For loop" + i);
        }

        // enhanced for loop
        int[] numbers = { 1, 2, 3, 4, 5 };
        for (int number : numbers) {
            System.out.println("enhanced for loop" + number);
        }

        // while loop

        int count = 0;
        while (count <= 10) {
            System.out.println("while loop" + count);
            count++;
        }

        // do-while loop
        int count2 = 0;
        do {
            System.out.println("do-while loop" + count2);
            count2++;
        } while (count2 <= 10);


        // nested loops
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("Nested loop: i=" + i + ", j=" + j);
            }
        }   
    }
}