
enum Status {
    PENDING, APPROVED, REJECTED
}

public class Enum {

    public static void main(String[] args) {
        Status currentStatus = Status.PENDING;

        switch (currentStatus) {
            case PENDING:
                System.out.println("The status is pending.");
                break;
            case APPROVED:
                System.out.println("The status is approved.");
                break;
            case REJECTED:
                System.out.println("The status is rejected.");
                break;
        }
    }
}
