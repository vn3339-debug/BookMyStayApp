import java.util.Scanner;

public class BookMyStayApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("     WELCOME TO BOOK MY STAY APP     ");
        System.out.println("=====================================");

        System.out.println("\n1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");

        System.out.print("\nEnter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("\n--- Login Page ---");
                // You will implement login logic later
                break;

            case 2:
                System.out.println("\n--- Registration Page ---");
                // You will implement register logic later
                break;

            case 3:
                System.out.println("\nThank you for using BookMyStay App!");
                break;

            default:
                System.out.println("\nInvalid choice! Please try again.");
        }

        sc.close();
    }
}
