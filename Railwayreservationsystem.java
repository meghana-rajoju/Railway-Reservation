import java.util.Scanner;

class Railwayreservationsystem {
    private int totalSeats = 10;
    private int availableSeats = totalSeats;

    public void showTrains() {
        System.out.println("Available Trains:");
        System.out.println("1. Express Train - 10 seats available");
        System.out.println("2. Superfast Train - 10 seats available");
        System.out.println("3. Shatabdi Express - 10 seats available");
    }

    public void checkAvailability() {
        if (availableSeats > 0) {
            System.out.println("Seats available: " + availableSeats);
        } else {
            System.out.println("No seats available.");
        }
    }

    public void bookTickets(int seatsToBook) {
        if (seatsToBook <= availableSeats && seatsToBook > 0) {
            availableSeats -= seatsToBook;
            System.out.println(seatsToBook + " tickets successfully booked.");
            System.out.println("Remaining seats: " + availableSeats);
        } else {
            System.out.println("Sorry, not enough seats available.");
        }
    }

    public void cancelTickets(int seatsToCancel) {
        if (seatsToCancel > 0) {
            availableSeats += seatsToCancel;
            System.out.println(seatsToCancel + " tickets successfully canceled.");
            System.out.println("Remaining seats: " + availableSeats);
        } else {
            System.out.println("Invalid input.");
        }
    }
}

public class Railwayreservationsystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RailwayReservation reservation = new RailwayReservation();
        int choice, seatsToBook, seatsToCancel;

        while (true) {
            System.out.println("\n************ Railway Reservation System ************");
            System.out.println("1. Show available trains");
            System.out.println("2. Check seat availability");
            System.out.println("3. Book tickets");
            System.out.println("4. Cancel tickets");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    reservation.showTrains();
                    break;
                case 2:
                    reservation.checkAvailability();
                    break;
                case 3:
                    System.out.print("Enter number of seats to book: ");
                    seatsToBook = scanner.nextInt();
                    reservation.bookTickets(seatsToBook);
                    break;
                case 4:
                    System.out.print("Enter number of seats to cancel: ");
                    seatsToCancel = scanner.nextInt();
                    reservation.cancelTickets(seatsToCancel);
                    break;
                case 5:
                    System.out.println("Exiting the system. Thank you for using Railway Reservation System.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
