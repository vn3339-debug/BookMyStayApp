/**
 * ============================================================
 * CLASS - PersistenceService
 * ============================================================
 *
 * Handles saving and loading system state using serialization.
 *
 * @author Developer
 * @version 12.0
 */

import java.io.*;

class PersistenceService {

    // Save data
    public void saveData(Object data, String filename) {

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(filename))) {

            oos.writeObject(data);
            System.out.println("Data saved successfully to " + filename);

        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    // Load data
    public Object loadData(String filename) {

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(filename))) {

            Object data = ois.readObject();
            System.out.println("Data loaded successfully from " + filename);
            return data;

        } catch (FileNotFoundException e) {
            System.out.println("No previous data found. Starting fresh.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }

        return null;
    }
}
