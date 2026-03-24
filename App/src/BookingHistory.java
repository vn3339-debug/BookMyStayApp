/**
 * ============================================================
 * CLASS - BookingHistory
 * ============================================================
 *
 * Stores confirmed reservations in insertion order.
 *
 * @author Developer
 * @version 8.0
 */

import java.util.*;

class BookingHistory {

    private List<Reservation> history;

    public BookingHistory() {
        history = new ArrayList<>();
    }

    // Add confirmed booking
    public void addBooking(Reservation reservation) {
        history.add(reservation);
    }

    // Get all bookings
    public List<Reservation> getAllBookings() {
        return history;
    }

    // Display bookings
    public void displayBookings() {
        System.out.println("Booking History:\n");

        for (Reservation r : history) {
            System.out.println(r.getGuestName() + " -> " + r.getRoomType());
        }
    }
}