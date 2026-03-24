/**
 * ============================================================
 * CLASS - RoomSearchService
 * ============================================================
 *
 * Use Case 4: Room Search & Availability Check
 *
 * This class provides read-only access to room availability.
 * It displays only available rooms without modifying inventory.
 *
 * @author Developer
 * @version 4.0
 */

class RoomSearchService {

    private RoomInventory inventory;

    public RoomSearchService(RoomInventory inventory) {
        this.inventory = inventory;
    }

    public void searchAvailableRooms() {

        System.out.println("Available Rooms:\n");

        // Create room objects
        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Check availability (read-only)
        if (inventory.getAvailability("Single Room") > 0) {
            single.displayRoomDetails();
            System.out.println("Available: " + inventory.getAvailability("Single Room"));
            System.out.println();
        }

        if (inventory.getAvailability("Double Room") > 0) {
            doubleRoom.displayRoomDetails();
            System.out.println("Available: " + inventory.getAvailability("Double Room"));
            System.out.println();
        }

        if (inventory.getAvailability("Suite Room") > 0) {
            suite.displayRoomDetails();
            System.out.println("Available: " + inventory.getAvailability("Suite Room"));
            System.out.println();
        }
    }
}