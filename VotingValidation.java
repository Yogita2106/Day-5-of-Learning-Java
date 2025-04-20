import java.util.Scanner;
class AgeNotValidException extends Exception {
    public AgeNotValidException(String message) {
        super(message);
    }
}

public class VotingValidation {
    public static void validateAge(int age) throws AgeNotValidException {
        if (age < 18) {
            throw new AgeNotValidException("Age is not valid for voting. Must be 18 or older.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            validateAge(age);
        } catch (AgeNotValidException e) {
            System.out.println("Exception " + e.getMessage());
        }
        sc.close();
    }
}
