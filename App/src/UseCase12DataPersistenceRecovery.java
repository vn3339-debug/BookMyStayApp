/**
 * ============================================================
 * MAIN CLASS - UseCase12DataPersistenceRecovery
 * ============================================================
 *
 * Use Case 12: Data Persistence & System Recovery
 *
 * Demonstrates saving and restoring system state.
 *
 * @author Developer
 * @version 12.1
 */

import java.util.*;

public class UseCase12DataPersistenceRecovery {

    public static void main(String[] args) {

        System.out.println("Hotel Booking System v12.1\n");

        PersistenceService service = new PersistenceService();

        // File names
        String inventoryFile = "inventory.dat";
        String bookingFile = "bookings.dat";

        // Try loading existing data
        RoomInventory inventory =
                (RoomInventory) service.loadData(inventoryFile);

        List<Reservation> bookings =
                (List<Reservation>) service.loadData(bookingFile);

        // If no data found → initialize fresh
        if (inventory == null) {
            inventory = new RoomInventory();
        }

        if (bookings == null) {
            bookings = new ArrayList<>();
        }

        // Simulate new booking
        Reservation r1 = new Reservation("Alice", "Single Room");
        bookings.add(r1);

        System.out.println("Added booking: "
                + r1.getGuestName() + " -> " + r1.getRoomType());

        // Save current state
        service.saveData(inventory, inventoryFile);
        service.saveData(bookings, bookingFile);

        // Display restored data
        System.out.println("\nRecovered Bookings:");

        for (Reservation r : bookings) {
            System.out.println(r.getGuestName() + " -> " + r.getRoomType());
        }
    }
}