/**
 * ============================================================
 * MAIN CLASS - UseCase5BookingRequestQueue
 * ============================================================
 *
 * Use Case 5: Booking Request (FIFO Queue)
 *
 * Demonstrates fair request handling using Queue.
 *
 * @author Developer
 * @version 5.1
 */

public class UseCase5BookingRequestQueue {

    public static void main(String[] args) {

        System.out.println("Hotel Booking System v5.1\n");

        // Initialize queue
        BookingQueue queue = new BookingQueue();

        // Add booking requests
        queue.addRequest(new Reservation("Alice", "Single Room"));
        queue.addRequest(new Reservation("Bob", "Double Room"));
        queue.addRequest(new Reservation("Charlie", "Suite Room"));

        // Display queue
        queue.displayQueue();
    }
}