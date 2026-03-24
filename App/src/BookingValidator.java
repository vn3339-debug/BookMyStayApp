/**
 * ============================================================
 * CLASS - BookingValidator
 * ============================================================
 *
 * Validates booking inputs and system constraints.
 *
 * @author Developer
 * @version 9.0
 */

class BookingValidator {

    public void validate(String guestName, String roomType, RoomInventory inventory)
            throws InvalidBookingException {

        // Validate guest name
        if (guestName == null || guestName.trim().isEmpty()) {
            throw new InvalidBookingException("Guest name cannot be empty");
        }

        // Validate room type
        if (roomType == null || roomType.trim().isEmpty()) {
            throw new InvalidBookingException("Room type cannot be empty");
        }

        // Check availability
        if (inventory.getAvailability(roomType) <= 0) {
            throw new InvalidBookingException("No availability for " + roomType);
        }
    }
}