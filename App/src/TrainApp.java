public class TrainAppUC18 {
    public static void main(String[] args) {

        // Bogie IDs (unsorted array)
        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG550"
        };

        // Search key
        String searchKey = "BG309";

        boolean found = false;

        // Linear Search
        for (int i = 0; i < bogieIds.length; i++) {

            if (bogieIds[i].equals(searchKey)) {
                found = true;
                System.out.println("Bogie " + searchKey + " FOUND at index " + i);
                break; // early termination
            }
        }

        if (!found) {
            System.out.println("Bogie " + searchKey + " NOT FOUND");
        }
    }
}