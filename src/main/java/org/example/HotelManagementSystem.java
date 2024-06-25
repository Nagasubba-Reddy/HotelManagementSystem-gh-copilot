package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelManagementSystem {
    public static void main(String[] args) {
        Room room1 = new Room(101, "Single", false);
        Room room2 = new Room(102, "Double", true);
        Room room3 = new Room(103, "Single", false);

        Hotel hotel = new Hotel("Hilton123", List.of(room1, room2, room3), new ArrayList<>());
        Scanner scanner = new Scanner(System.in);
        // while loop to keep the program running
        while (true) {
            System.out.println("1. Check-in");
            System.out.println("2. Check-out");
            System.out.println("3. Show all rooms");
            System.out.println("4. Show all reservations");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter room number:");
                    int roomNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter check-in date:");
                    String checkInDate = scanner.nextLine();
                    System.out.println("Enter check-out date:");
                    String checkOutDate = scanner.nextLine();
                    System.out.println("Enter guest name:");
                    String guestName = scanner.nextLine();
                    System.out.println("Enter guest phone number:");
                    String guestPhoneNumber = scanner.nextLine();
                    System.out.println("Enter number of guests:");
                    int numberOfGuests = scanner.nextInt();
                    scanner.nextLine();
                    hotel.getReservations().add(new Reservation(hotel.getReservations().size() + 1, "Reservation" + (hotel.getReservations().size() + 1), roomNumber, checkInDate, checkOutDate, guestName, guestPhoneNumber, numberOfGuests));
                    break;
                case 2:
                    System.out.println("Enter reservation id:");
                    int reservationId = scanner.nextInt();
                    scanner.nextLine();
                    for (Reservation reservation : hotel.getReservations()) {
                        if (reservation.getId() == reservationId) {
                            hotel.getReservations().remove(reservation);
                            break;
                        }
                    }
                    break;
                case 3:
                    displayRooms(hotel);
                    break;
                case 4:
                    displayReservations(hotel);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    // display all rooms of a hotel with all the properties and also display them in beautiful format
    public static void displayRooms(Hotel hotel) {
        // print room details in a beautiful format
        System.out.println("Room Number\tType\tOccupied");
        for (Room room : hotel.getRooms()) {
            System.out.println(room.getNumber() + "\t" + room.getType() + "\t" + room.isOccupied());
        }
    }

    // display all reservations of a hotel with all the properties and also display them in beautiful format
    public static void displayReservations(Hotel hotel) {
        // print reservation details in a beautiful format
        System.out.println("Id\tName\tRoom Number\tCheck-in Date\tCheck-out Date\tGuest Name\tGuest Phone Number\tNumber of Guests");
        for (Reservation reservation : hotel.getReservations()) {
            System.out.println(reservation.getId() + "\t" + reservation.getName() + "\t" + reservation.getRoomNumber() + "\t" + reservation.getCheckInDate() + "\t" + reservation.getCheckOutDate() + "\t" + reservation.getGuestName() + "\t" + reservation.getGuestPhoneNumber() + "\t" + reservation.getNumberOfGuests());
        }
    }



}