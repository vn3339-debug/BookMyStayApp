/**
 * ============================================================
 * MAIN CLASS - UseCase7AddOnServiceSelection
 * ============================================================
 *
 * Use Case 7: Add-On Service Selection
 *
 * Demonstrates attaching optional services to reservations.
 *
 * @author Developer
 * @version 7.1
 */

public class UseCase7AddOnServiceSelection {

    public static void main(String[] args) {

        System.out.println("Hotel Booking System v7.1\n");

        // Create service manager
        AddOnServiceManager manager = new AddOnServiceManager();

        // Sample reservation IDs
        String res1 = "RES101";
        String res2 = "RES102";

        // Add services
        manager.addService(res1, new AddOnService("Breakfast", 500));
        manager.addService(res1, new AddOnService("Spa", 1500));

        manager.addService(res2, new AddOnService("Airport Pickup", 800));

        // Display services
        manager.displayServices(res1);
        manager.displayServices(res2);

        // Show total cost
        System.out.println("\nTotal cost for " + res1 + ": "
                + manager.calculateTotalCost(res1));

        System.out.println("Total cost for " + res2 + ": "
                + manager.calculateTotalCost(res2));
    }
}