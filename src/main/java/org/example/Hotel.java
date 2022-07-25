package org.example;

public class Hotel {
    Room[] rooms;

    Hotel(){
        for (int i = 0; i < 12; i++) {
            rooms[i] = new Room();
        }
    }
}
