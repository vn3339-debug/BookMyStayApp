/**
 * ============================================================
 * CLASS - ConcurrentBookingProcessor
 * ============================================================
 *
 * Processes booking requests using multiple threads safely.
 *
 * @author Developer
 * @version 11.0
 */

class ConcurrentBookingProcessor implements Runnable {

    private BookingQueue queue;
    private RoomAllocationService service;

    public ConcurrentBookingProcessor(BookingQueue queue, RoomAllocationService service) {
        this.queue = queue;
        this.service = service;
    }

    @Override
    public void run() {

        Reservation r;

        while ((r = queue.getNextRequest()) != null) {

            // Critical section
            synchronized (service) {
                service.processBooking(r);
            }

            try {
                Thread.sleep(100); // simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}