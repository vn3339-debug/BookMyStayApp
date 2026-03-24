/**
 * ============================================================
 * CLASS - BookingQueue
 * ============================================================
 *
 * Manages booking requests using FIFO Queue.
 *
 * @author Developer
 * @version 5.0
 */

import java.util.LinkedList;
import java.util.Queue;

class BookingQueue {

    private Queue<Reservation> queue;

    public BookingQueue() {
        queue = new LinkedList<>();
    }

    // Add request
    public void addRequest(Reservation reservation) {
        queue.add(reservation);
        System.out.println("Request added: "
                + reservation.getGuestName() + " -> "
                + reservation.getRoomType());
    }

    // Display queue
    public void displayQueue() {
        System.out.println("\nCurrent Booking Queue:");
        for (Reservation r : queue) {
            System.out.println(r.getGuestName() + " -> " + r.getRoomType());
        }
    }

    // NEW METHOD (ADD THIS ONLY)
    public Reservation getNextRequest() {
        return queue.poll();
    }
}