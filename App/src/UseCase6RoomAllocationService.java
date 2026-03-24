/**
 * ============================================================
 * MAIN CLASS - UseCase6RoomAllocationService
 * ============================================================
 *
 * Use Case 6: Reservation Confirmation & Room Allocation
 *
 * Demonstrates processing of booking queue
 * and allocation of rooms safely.
 *
 * @author Developer
 * @version 6.1
 */

public class UseCase6RoomAllocationService {

    public static void main(String[] args) {

        System.out.println("Hotel Booking System v6.1\n");

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Initialize queue
        BookingQueue queue = new BookingQueue();

        // Add booking requests
        queue.addRequest(new Reservation("Alice", "Single Room"));
        queue.addRequest(new Reservation("Bob", "Double Room"));
        queue.addRequest(new Reservation("Charlie", "Suite Room"));

        // Allocation service
        RoomAllocationService service = new RoomAllocationService(inventory);

        System.out.println("\nProcessing bookings...\n");

        // Process queue
        Reservation r;
        while ((r = queue.getNextRequest()) != null) {
            service.processBooking(r);
        }
    }
}