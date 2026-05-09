/**
 * Represents a Utility Vehicle (SUV/crossover) in the car inventory system.
 * Adds a fourWheelDrive property to the base Car fields.
 */
public class UtilityVehicle extends Car {

    // Whether this vehicle has four-wheel drive capability
    private boolean fourWheelDrive;

    /**
     * Constructs a UtilityVehicle with standard Car properties plus 4WD status.
     *
     * @param vinNumber     the vehicle identification number
     * @param make          the manufacturer of the car
     * @param model         the model name
     * @param mileage       the current mileage
     * @param fourWheelDrive true if the vehicle has four-wheel drive
     */
    public static void main(String[] args) {
        UtilityVehicle suv = new UtilityVehicle("2T1BURHE0JC043821", "Toyota", "RAV4", 15000, true);
        System.out.println(suv.getInfo());

        UtilityVehicle suv2 = new UtilityVehicle("5XYZU3LB8FG999999", "Hyundai", "Tucson", 22000, false);
        System.out.println(suv2.getInfo());
    }

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    public boolean isFourWheelDrive() { return fourWheelDrive; }
    public void setFourWheelDrive(boolean fourWheelDrive) { this.fourWheelDrive = fourWheelDrive; }

    /**
     * Returns a formatted string describing this UtilityVehicle,
     * including its four-wheel drive status.
     *
     * @return a human-readable summary
     */
    @Override
    public String getInfo() {
        return "[Utility Vehicle] " + super.getInfo() +
               " | 4WD: " + (fourWheelDrive ? "Yes" : "No");
    }
}
