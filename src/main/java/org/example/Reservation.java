package org.example;
/* class with properties id, name, roomNumber, checkInDate, checkOutDate, guestName, guestPhoneNumber, numberOfGuests
* and constructor with all properties and toString method for all properties
*/
public class Reservation {

    private int id;
    private String name;
    private int roomNumber;
    private String checkInDate;
    private String checkOutDate;
    private String guestName;
    private String guestPhoneNumber;
    private int numberOfGuests;

    public Reservation(int id, String name, int roomNumber, String checkInDate, String checkOutDate, String guestName, String guestPhoneNumber, int numberOfGuests) {
        this.id = id;
        this.name = name;
        this.roomNumber = roomNumber;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.guestName = guestName;
        this.guestPhoneNumber = guestPhoneNumber;
        this.numberOfGuests = numberOfGuests;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getGuestPhoneNumber() {
        return guestPhoneNumber;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public void setGuestPhoneNumber(String guestPhoneNumber) {
        this.guestPhoneNumber = guestPhoneNumber;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    // toString method for all properties
    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", roomNumber=" + roomNumber +
                ", checkInDate='" + checkInDate + '\'' +
                ", checkOutDate='" + checkOutDate + '\'' +
                ", guestName='" + guestName + '\'' +
                ", guestPhoneNumber='" + guestPhoneNumber + '\'' +
                ", numberOfGuests=" + numberOfGuests +
                '}';
    }

}