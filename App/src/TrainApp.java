import java.util.*;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashMap for bogie → capacity
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Add mappings (bogie → capacity)
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);

        // Display all bogies with capacity
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}