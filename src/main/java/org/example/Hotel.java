package org.example;

import java.util.List;

// class with properties name, list of rooms, list of reservations
public class Hotel {
    private String name;
    private List<Room> rooms;
    private List<Reservation> reservations;

    public Hotel(String name, List<Room> rooms, List<Reservation> reservations) {
        this.name = name;
        this.rooms = rooms;
        this.reservations = reservations;
    }

    public String getName() {
        return name;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", rooms=" + rooms +
                ", reservations=" + reservations +
                '}';
    }
}
