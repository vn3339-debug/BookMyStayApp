/**
 * ============================================================
 * MAIN CLASS - UseCase4RoomSearch
 * ============================================================
 *
 * Use Case 4: Room Search & Availability Check
 *
 * Demonstrates read-only search functionality
 * without modifying inventory state.
 *
 * @author Developer
 * @version 4.1
 */

public class UseCase4RoomSearch {

    public static void main(String[] args) {

        System.out.println("Hotel Booking System v4.1\n");

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Initialize search service
        RoomSearchService searchService = new RoomSearchService(inventory);

        // Perform search
        searchService.searchAvailableRooms();
    }
}