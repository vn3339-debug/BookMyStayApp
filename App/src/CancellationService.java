/**
 * ============================================================
 * CLASS - CancellationService
 * ============================================================
 *
 * Use Case 10: Booking Cancellation & Inventory Rollback
 *
 * Handles cancellation and restores system state safely.
 *
 * @author Developer
 * @version 10.0
 */

import java.util.*;

class CancellationService {

    private RoomInventory inventory;
    private Map<String, String> reservationToRoom;
    private Stack<String> rollbackStack;

    public CancellationService(RoomInventory inventory) {
        this.inventory = inventory;
        this.reservationToRoom = new HashMap<>();
        this.rollbackStack = new Stack<>();
    }

    // Store confirmed reservation (simulate UC6 linkage)
    public void addConfirmedBooking(String reservationId, String roomType, String roomId) {
        reservationToRoom.put(reservationId, roomType + ":" + roomId);
    }

    // Cancel booking
    public void cancelBooking(String reservationId) {

        // Validate existence
        if (!reservationToRoom.containsKey(reservationId)) {
            System.out.println("Cancellation Failed: Reservation not found");
            return;
        }

        // Get stored details
        String data = reservationToRoom.get(reservationId);
        String[] parts = data.split(":");
        String roomType = parts[0];
        String roomId = parts[1];

        // Push to rollback stack
        rollbackStack.push(roomId);

        // Restore inventory
        int current = inventory.getAvailability(roomType);
        inventory.updateAvailability(roomType, current + 1);

        // Remove booking
        reservationToRoom.remove(reservationId);

        System.out.println("Booking Cancelled: " + reservationId
                + " | Room ID released: " + roomId);
    }

    // Display rollback stack
    public void showRollbackStack() {
        System.out.println("\nRollback Stack (Recent Releases): " + rollbackStack);
    }
}
