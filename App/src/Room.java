/**
 * ============================================================
 * ABSTRACT CLASS - Room
 * ============================================================
 *
 * Represents a generic room in the Hotel Booking System.
 *
 * This class defines common attributes and behavior
 * shared by all room types.
 *
 * @author Developer
 * @version 2.0
 */

abstract class Room {

    protected String roomType;
    protected int beds;
    protected double price;

    public Room(String roomType, int beds, double price) {
        this.roomType = roomType;
        this.beds = beds;
        this.price = price;
    }

    public void displayRoomDetails() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Beds: " + beds);
        System.out.println("Price per night: " + price);
    }
}
