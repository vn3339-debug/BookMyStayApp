/**
 * ============================================================
 * MAIN CLASS - UseCase9ErrorHandlingValidation
 * ============================================================
 *
 * Use Case 9: Error Handling & Validation
 *
 * Demonstrates validation and exception handling
 * for booking inputs.
 *
 * @author Developer
 * @version 9.1
 */

public class UseCase9ErrorHandlingValidation {

    public static void main(String[] args) {

        System.out.println("Hotel Booking System v9.1\n");

        RoomInventory inventory = new RoomInventory();
        BookingValidator validator = new BookingValidator();

        try {
            // VALID CASE
            validator.validate("Alice", "Single Room", inventory);
            System.out.println("Booking validated successfully for Alice");

            // INVALID CASE (no such room / or zero availability)
            validator.validate("Bob", "Luxury Room", inventory);

        } catch (InvalidBookingException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nSystem continues running safely...");
    }
}
