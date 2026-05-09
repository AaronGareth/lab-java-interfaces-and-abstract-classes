/**
 * Represents a Sedan in the car inventory system.
 * Sedans have no extra properties beyond those defined in Car.
 */
public class Sedan extends Car {

    /**
     * Constructs a Sedan with the standard Car properties.
     *
     * @param vinNumber the vehicle identification number
     * @param make      the manufacturer of the car
     * @param model     the model name
     * @param mileage   the current mileage
     */
    public static void main(String[] args) {
        Sedan sedan = new Sedan("1HGBH41JXMN109186", "Honda", "Civic", 32000);
        System.out.println(sedan.getInfo());
    }

    public Sedan(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

    /**
     * Returns a formatted string describing this Sedan.
     *
     * @return a human-readable summary including vehicle type
     */
    @Override
    public String getInfo() {
        return "[Sedan] " + super.getInfo();
    }
}
