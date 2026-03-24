/**
 * ============================================================
 * CLASS - Reservation
 * ============================================================
 *
 * Represents a booking request made by a guest.
 *
 * @author Developer
 * @version 5.0
 */

import java.io.Serializable;

class Reservation implements Serializable {

    private String guestName;
    private String roomType;

    public Reservation(String guestName, String roomType) {
        this.guestName = guestName;
        this.roomType = roomType;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getRoomType() {
        return roomType;
    }
}