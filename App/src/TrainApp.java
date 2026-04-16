class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsBogie {
    String shape;
    String cargo;

    GoodsBogie(String shape) {
        this.shape = shape;
    }

    void assignCargo(String cargo) {
        try {
            System.out.println("Assigning cargo: " + cargo + " to " + shape + " bogie");

            // Safety rule: Rectangular cannot carry Petroleum
            if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo assignment: Petroleum not allowed in Rectangular bogie");
            }

            this.cargo = cargo;
            System.out.println("Cargo assigned successfully");

        } catch (CargoSafetyException e) {
            System.out.println("ERROR: " + e.getMessage());

        } finally {
            System.out.println("Finalizing assignment for " + shape + " bogie\n");
        }
    }
}

public class TrainAppUC15 {
    public static void main(String[] args) {

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        b1.assignCargo("Petroleum"); // safe

        GoodsBogie b2 = new GoodsBogie("Rectangular");
        b2.assignCargo("Petroleum"); // unsafe

        GoodsBogie b3 = new GoodsBogie("Rectangular");
        b3.assignCargo("Coal"); // safe

        System.out.println("System continues running safely...");
    }
}