/**
 * ============================================================
 * CLASS - InvalidBookingException
 * ============================================================
 *
 * Custom exception for invalid booking scenarios.
 *
 * @author Developer
 * @version 9.0
 */

class InvalidBookingException extends Exception {

    public InvalidBookingException(String message) {
        super(message);
    }
}
