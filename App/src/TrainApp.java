import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter Train ID: ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = sc.nextLine();

        // Regex patterns
        Pattern trainPattern = Pattern.compile("TRN-\\d{4}");
        Pattern cargoPattern = Pattern.compile("PET-[A-Z]{2}");

        // Matcher objects
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // Validation
        boolean isTrainValid = trainMatcher.matches();
        boolean isCargoValid = cargoMatcher.matches();

        System.out.println("\n--- Validation Result ---");

        if (isTrainValid) {
            System.out.println("Train ID is VALID: " + trainId);
        } else {
            System.out.println("Train ID is INVALID: " + trainId);
        }

        if (isCargoValid) {
            System.out.println("Cargo Code is VALID: " + cargoCode);
        } else {
            System.out.println("Cargo Code is INVALID: " + cargoCode);
        }

        sc.close();
    }
}