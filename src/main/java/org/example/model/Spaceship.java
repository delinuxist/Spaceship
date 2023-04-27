package org.example.model;

import java.util.HashMap;
import java.util.List;
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

    public void bookSeat(List<Seat> seats) {
        for(Seat seat : seats){
            if (this.seats.size() < capacity){
                this.seats.put(seat.getID(),seat);
            } else {
                return;
            }
        }
    }

    public  Map<Integer, Seat> getSeats() {
        return seats;
    }

    public Seat getPassenger(Integer ID){
        return seats.get(ID);
    }

    public void removePassenger(Seat seat) {
        if (seats.containsKey(seat.getID())){
            seats.remove(seat.getID());
        } else {
            System.out.println("Oops passenger doesn't exist...!!");
        }
    }

    public void removePassenger(List<Seat> passengers) {
        for(Seat passenger : passengers){
            seats.remove(passenger.getID());
        }
    }
}
