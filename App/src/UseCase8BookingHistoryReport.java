/**
 * ============================================================
 * MAIN CLASS - UseCase8BookingHistoryReport
 * ============================================================
 *
 * Use Case 8: Booking History & Reporting
 *
 * Demonstrates storing confirmed bookings
 * and generating reports.
 *
 * @author Developer
 * @version 8.1
 */

public class UseCase8BookingHistoryReport {

    public static void main(String[] args) {

        System.out.println("Hotel Booking System v8.1\n");

        // Create history
        BookingHistory history = new BookingHistory();

        // Simulate confirmed bookings
        history.addBooking(new Reservation("Alice", "Single Room"));
        history.addBooking(new Reservation("Bob", "Double Room"));
        history.addBooking(new Reservation("Charlie", "Single Room"));

        // Display history
        history.displayBookings();

        // Generate report
        BookingReportService reportService = new BookingReportService();
        reportService.generateSummary(history.getAllBookings());
    }
}