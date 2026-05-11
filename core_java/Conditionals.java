public class Conditionals {
    public static void main(String[] atgs) {
        // if statement

        int value = 10;

        if (value >= 10) {
            System.out.println(value);
        }

        // if-else statement
        if (value >= 10) {
            System.out.println(value);
        } else {
            System.out.println("Value is less than 10");
        }

        // if-else-if statement
        if (value > 10) {
            System.out.println("Value is greater than 10");
        } else if (value < 10) {
            System.out.println("Value is less than 10");
        } else {
            System.out.println("Value is equal to 10");
        }

        // switch statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // ternary operator
        String result = (value >= 10) ? "Value is greater than or equal to 10" : "Value is less than 10";
        System.out.println(result);

    }
}