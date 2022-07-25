package org.example;

public class Room {
    private int roomNr;
    private int howBigIsTheRoom;
    private boolean isBathroom;
    private boolean isAvailable;

    @Override
    public String toString() {
        return "Room{" +
                "roomNr=" + roomNr +
                ", howBigIsTheRoom=" + howBigIsTheRoom +
                ", isBathroom=" + isBathroom +
                ", isAvailable=" + isAvailable +
                '}';
    }
}