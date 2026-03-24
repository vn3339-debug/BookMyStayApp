/**
 * ============================================================
 * CLASS - AddOnServiceManager
 * ============================================================
 *
 * Manages mapping between reservations and selected services.
 *
 * @author Developer
 * @version 7.0
 */

import java.util.*;

class AddOnServiceManager {

    private Map<String, List<AddOnService>> serviceMap;

    public AddOnServiceManager() {
        serviceMap = new HashMap<>();
    }

    // Add service to reservation
    public void addService(String reservationId, AddOnService service) {

        serviceMap
                .computeIfAbsent(reservationId, k -> new ArrayList<>())
                .add(service);

        System.out.println("Added service: "
                + service.getServiceName()
                + " to Reservation: " + reservationId);
    }

    // Calculate total cost
    public double calculateTotalCost(String reservationId) {

        double total = 0;

        List<AddOnService> services = serviceMap.get(reservationId);

        if (services != null) {
            for (AddOnService s : services) {
                total += s.getCost();
            }
        }

        return total;
    }

    // Display services
    public void displayServices(String reservationId) {

        System.out.println("\nServices for Reservation " + reservationId + ":");

        List<AddOnService> services = serviceMap.get(reservationId);

        if (services != null) {
            for (AddOnService s : services) {
                System.out.println(s.getServiceName() + " -> " + s.getCost());
            }
        } else {
            System.out.println("No services added.");
        }
    }
}
