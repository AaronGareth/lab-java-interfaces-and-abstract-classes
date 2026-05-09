/**
 * Abstract base class representing a generic car in the inventory system.
 * All car types (Sedan, UtilityVehicle, Truck) extend this class.
 */
public abstract class Car {

    // Core properties shared by all car types
    private String vinNumber;
    private String make;
    private String model;
    private int mileage;

    /**
     * Constructs a Car with all required fields.
     *
     * @param vinNumber the vehicle identification number
     * @param make      the manufacturer of the car (e.g. "Toyota")
     * @param model     the model name (e.g. "Camry")
     * @param mileage   the current mileage of the car
     */
    public Car(String vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    // --- Getters and Setters ---

    public String getVinNumber() { return vinNumber; }
    public void setVinNumber(String vinNumber) { this.vinNumber = vinNumber; }

    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getMileage() { return mileage; }
    public void setMileage(int mileage) { this.mileage = mileage; }

    /**
     * Returns a formatted string with all of this car's properties.
     * Subclasses should override this to include their extra fields.
     *
     * @return a human-readable summary of the car
     */
    public String getInfo() {
        return "VIN: " + vinNumber +
               " | Make: " + make +
               " | Model: " + model +
               " | Mileage: " + mileage + " miles";
    }
}
