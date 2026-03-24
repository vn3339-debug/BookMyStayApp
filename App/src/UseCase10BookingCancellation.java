/**
 * ============================================================
 * MAIN CLASS - UseCase10BookingCancellation
 * ============================================================
 *
 * Use Case 10: Booking Cancellation & Inventory Rollback
 *
 * Demonstrates safe cancellation and rollback using Stack.
 *
 * @author Developer
 * @version 10.1
 */

public class UseCase10BookingCancellation {

    public static void main(String[] args) {

        System.out.println("Hotel Booking System v10.1\n");

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Initialize cancellation service
        CancellationService service = new CancellationService(inventory);

        // Simulate confirmed bookings (from UC6)
        service.addConfirmedBooking("RES101", "Single Room", "SI101");
        service.addConfirmedBooking("RES102", "Double Room", "DO202");

        // Cancel booking
        service.cancelBooking("RES101");

        // Invalid cancellation
        service.cancelBooking("RES999");

        // Show rollback stack
        service.showRollbackStack();

        // Check inventory after rollback
        System.out.println("\nUpdated Inventory:");
        System.out.println("Single Room: " + inventory.getAvailability("Single Room"));
        System.out.println("Double Room: " + inventory.getAvailability("Double Room"));
    }
}
