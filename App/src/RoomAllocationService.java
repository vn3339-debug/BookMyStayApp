/**
 * ============================================================
 * CLASS - RoomAllocationService
 * ============================================================
 *
 * Use Case 6: Reservation Confirmation & Room Allocation
 *
 * Handles booking confirmation and ensures
 * unique room assignment using Set.
 *
 * @author Developer
 * @version 6.0
 */

import java.util.*;

class RoomAllocationService {

    private RoomInventory inventory;
    private Set<String> allocatedRooms;
    private Map<String, Set<String>> roomAllocations;

    public RoomAllocationService(RoomInventory inventory) {
        this.inventory = inventory;
        this.allocatedRooms = new HashSet<>();
        this.roomAllocations = new HashMap<>();
    }

    public void processBooking(Reservation reservation) {

        String roomType = reservation.getRoomType();

        // Check availability
        if (inventory.getAvailability(roomType) > 0) {

            // Generate unique room ID
            String roomId = generateRoomId(roomType);

            // Store allocated room
            allocatedRooms.add(roomId);

            roomAllocations
                    .computeIfAbsent(roomType, k -> new HashSet<>())
                    .add(roomId);

            // Update inventory
            int current = inventory.getAvailability(roomType);
            inventory.updateAvailability(roomType, current - 1);

            System.out.println("Booking Confirmed for "
                    + reservation.getGuestName()
                    + " | Room Type: " + roomType
                    + " | Room ID: " + roomId);

        } else {
            System.out.println("Booking Failed for "
                    + reservation.getGuestName()
                    + " | No rooms available for " + roomType);
        }
    }

    private String generateRoomId(String roomType) {
        String id;
        do {
            id = roomType.substring(0, 2).toUpperCase() + new Random().nextInt(1000);
        } while (allocatedRooms.contains(id));
        return id;
    }
}

