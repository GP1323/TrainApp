import java.util.Arrays;

public class TrainAppUC19 {

    public static boolean binarySearch(String[] arr, String key) {

        // Step 1: Ensure sorted input (important requirement)
        Arrays.sort(arr);

        int low = 0;
        int high = arr.length - 1;

        // Step 2: Binary Search loop
        while (low <= high) {

            int mid = (low + high) / 2;

            int result = key.compareTo(arr[mid]);

            if (result == 0) {
                return true; // found
            }
            else if (result > 0) {
                low = mid + 1; // search right half
            }
            else {
                high = mid - 1; // search left half
            }
        }

        return false; // not found
    }

    public static void main(String[] args) {

        String[] bogieIds = {
                "BG309",
                "BG101",
                "BG550",
                "BG205",
                "BG412"
        };

        String searchKey = "BG205";

        boolean found = binarySearch(bogieIds, searchKey);

        if (found) {
            System.out.println("Bogie ID " + searchKey + " FOUND in train consist.");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT FOUND in train consist.");
        }
    }
}