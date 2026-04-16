public class TrainAppUC20 {

    // Search method with validation
    public static boolean searchBogie(String[] bogies, String key) {

        // ✅ Fail-fast validation
        if (bogies == null || bogies.length == 0) {
            throw new IllegalStateException("No bogies available in train consist. Search not allowed.");
        }

        // Linear search (can also be binary if sorted, but UC20 focuses on validation)
        for (String b : bogies) {
            if (b.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        // Case 1: Empty array (will throw exception)
        String[] bogies = {};

        String searchKey = "BG101";

        try {
            boolean result = searchBogie(bogies, searchKey);

            if (result) {
                System.out.println("Bogie " + searchKey + " FOUND.");
            } else {
                System.out.println("Bogie " + searchKey + " NOT FOUND.");
            }

        } catch (IllegalStateException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.println("Program continues safely...");
    }
}