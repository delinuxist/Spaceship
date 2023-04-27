package org.example.model;

import org.example.booking.Booking;

public class MartianSeat extends Seat {
    public MartianSeat(String name) {
        this(name,new Pluto(false));
    }

    public MartianSeat(String name,Pluto pluto){
        super(name);
        this.pluto = pluto;
    }

    @Override
    public void getMeal() {
        System.out.println("Martian Food");
    }
}
