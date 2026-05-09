import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Utility class providing helper methods for BigDecimal operations.
 */
public class BigDecimalUtils {

    /**
     * Rounds a BigDecimal value to the nearest hundredth (2 decimal places)
     * and returns the result as a double.
     *
     * Example: 4.2545 → 4.25
     *
     * @param number the BigDecimal value to round
     * @return the value rounded to 2 decimal places as a double
     */
    public static void main(String[] args) {
        System.out.println("=== BigDecimal Operations ===");

        System.out.println(roundToHundredth(new BigDecimal("4.2545")));   // → 4.25
        System.out.println(roundToHundredth(new BigDecimal("9.9999")));   // → 10.0

        System.out.println(reverseAndRoundToTenth(new BigDecimal("1.2345")));  // → -1.2
        System.out.println(reverseAndRoundToTenth(new BigDecimal("-45.67")));  // → 45.7
    }

    public static double roundToHundredth(BigDecimal number) {
        // Use HALF_DOWN rounding to round to the nearest hundredth
        return number.setScale(2, RoundingMode.HALF_DOWN).doubleValue();
    }

    /**
     * Reverses the sign of a BigDecimal value, rounds it to the nearest
     * tenth (1 decimal place), and returns the result as a BigDecimal.
     *
     * Examples:
     *   1.2345  → -1.2
     *  -45.67   →  45.7
     *
     * @param number the BigDecimal value to negate and round
     * @return the negated value rounded to 1 decimal place
     */
    public static BigDecimal reverseAndRoundToTenth(BigDecimal number) {
        // Negate the sign first, then round to 1 decimal place
        return number.negate().setScale(1, RoundingMode.HALF_UP);
    }
}
