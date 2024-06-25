package org.example;
//Room class with properties number type occupied
public class Room {
    private int number;
    private String type;
    private boolean occupied;

    public Room(int number, String type, boolean occupied) {
        this.number = number;
        this.type = type;
        this.occupied = occupied;
    }

    public int getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                ", type='" + type + '\'' +
                ", occupied=" + occupied +
                '}';
    }
}
