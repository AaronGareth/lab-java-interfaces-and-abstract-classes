/**
 * Represents a Truck in the car inventory system.
 * Adds a towingCapacity property to the base Car fields.
 */
public class Truck extends Car {

    // Maximum towing capacity in pounds (or relevant unit)
    private double towingCapacity;

    /**
     * Constructs a Truck with standard Car properties plus towing capacity.
     *
     * @param vinNumber      the vehicle identification number
     * @param make           the manufacturer of the truck
     * @param model          the model name
     * @param mileage        the current mileage
     * @param towingCapacity the maximum towing capacity
     */
    public static void main(String[] args) {
        Truck truck = new Truck("3GCPCREC0EG999999", "Chevrolet", "Silverado", 48000, 12500.0);
        System.out.println(truck.getInfo());

        Truck truck2 = new Truck("1FTFW1ET5EKE99999", "Ford", "F-150", 61000, 8200.0);
        System.out.println(truck2.getInfo());
    }

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    public double getTowingCapacity() { return towingCapacity; }
    public void setTowingCapacity(double towingCapacity) { this.towingCapacity = towingCapacity; }

    /**
     * Returns a formatted string describing this Truck,
     * including its towing capacity.
     *
     * @return a human-readable summary
     */
    @Override
    public String getInfo() {
        return "[Truck] " + super.getInfo() +
               " | Towing Capacity: " + towingCapacity + " lbs";
    }
}
