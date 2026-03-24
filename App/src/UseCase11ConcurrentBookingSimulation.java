/**
 * ============================================================
 * MAIN CLASS - UseCase11ConcurrentBookingSimulation
 * ============================================================
 *
 * Use Case 11: Concurrent Booking Simulation
 *
 * Demonstrates thread-safe booking using synchronization.
 *
 * @author Developer
 * @version 11.1
 */

public class UseCase11ConcurrentBookingSimulation {

    public static void main(String[] args) {

        System.out.println("Hotel Booking System v11.1\n");

        // Shared resources
        RoomInventory inventory = new RoomInventory();
        BookingQueue queue = new BookingQueue();
        RoomAllocationService service = new RoomAllocationService(inventory);

        // Add booking requests
        queue.addRequest(new Reservation("Alice", "Single Room"));
        queue.addRequest(new Reservation("Bob", "Single Room"));
        queue.addRequest(new Reservation("Charlie", "Single Room"));
        queue.addRequest(new Reservation("David", "Single Room"));

        // Create threads
        Thread t1 = new Thread(new ConcurrentBookingProcessor(queue, service));
        Thread t2 = new Thread(new ConcurrentBookingProcessor(queue, service));

        // Start threads
        t1.start();
        t2.start();
    }
}