```java
import java.util.ArrayList;
import java.util.Scanner;

// Class to store customer booking information
class Booking {
    String customerName;
    int roomNumber;

    Booking(String customerName, int roomNumber) {
        this.customerName = customerName;
        this.roomNumber = roomNumber;
    }
}

// Main Hotel Management System class
public class HotelManagementSystem {
    static ArrayList<Booking> bookings = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Hotel Management System ---");
            System.out.println("1. Add Booking");
            System.out.println("2. View All Bookings");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> addBooking();
                case 2 -> viewBookings();
                case 3 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice, try again.");
            }
        } while (choice != 3);
    }

    // Add a new booking
    public static void addBooking() {
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter room number: ");
        int room = scanner.nextInt();
        scanner.nextLine(); // consume newline

        bookings.add(new Booking(name, room));
        System.out.println("Booking added successfully!");
    }

    // Display all bookings
    public static void viewBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings yet.");
            return;
        }
        System.out.println("\n--- All Bookings ---");
        for (Booking b : bookings) {
            System.out.println("Customer: " + b.customerName + ", Room: " + b.roomNumber);
        }
    }
}
```
