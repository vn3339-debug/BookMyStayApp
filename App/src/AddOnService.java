/**
 * ============================================================
 * CLASS - AddOnService
 * ============================================================
 *
 * Represents an optional service for a reservation.
 *
 * @author Developer
 * @version 7.0
 */

class AddOnService {

    private String serviceName;
    private double cost;

    public AddOnService(String serviceName, double cost) {
        this.serviceName = serviceName;
        this.cost = cost;
    }

    public String getServiceName() {
        return serviceName;
    }

    public double getCost() {
        return cost;
    }
}