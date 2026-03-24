/**
 * ============================================================
 * CLASS - BookingReportService
 * ============================================================
 *
 * Generates reports from booking history.
 *
 * @author Developer
 * @version 8.0
 */

import java.util.*;

class BookingReportService {

    public void generateSummary(List<Reservation> bookings) {

        System.out.println("\nBooking Summary Report:\n");

        Map<String, Integer> report = new HashMap<>();

        for (Reservation r : bookings) {
            String type = r.getRoomType();
            report.put(type, report.getOrDefault(type, 0) + 1);
        }

        for (String roomType : report.keySet()) {
            System.out.println(roomType + " booked: " + report.get(roomType));
        }
    }
}
