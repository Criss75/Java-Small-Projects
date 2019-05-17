package com.criss75;

/**
 * Define room for the course
 */
public class Room {
    private String roomName;
    private boolean available;

    /**
     * Creates a new room object
     *
     * @param roomName  name of the room
     * @param available availability (true or false)
     */
    public Room(String roomName, boolean available) {
        this.roomName = roomName;
        this.available = available;
    }

    /**
     * @return returns name of the room
     */
    public String getRoomName() {
        return roomName;
    }

    /**
     * @return returns availability of the room
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * @param availability possibility to set availability
     */
    void setAvailability(boolean availability) {
        this.available = availability;
    }

    @Override
    public String toString() {
        return "Room: " + getRoomName() + "\nAvailability:" + isAvailable();
    }
}
