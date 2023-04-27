package org.example.model;

import java.util.HashMap;
import java.util.Map;

public class Spaceship {
    private final Integer capacity;

    private final Map<Integer,Seat> seats = new HashMap<>();

    public Spaceship(Integer capacity){
        this.capacity = capacity;
    }

    public void bookSeat(Seat seat) {
        if(seats.size() < capacity) {
            seats.put(seat.getID(),seat);
        } else {
            System.out.println("Number of passengers is greater than capacity");
        }

    }

    public  Map<Integer, Seat> getSeats() {
        return seats;
    }

    public Seat getPassenger(Integer ID){
        return seats.get(ID);
    }
}
