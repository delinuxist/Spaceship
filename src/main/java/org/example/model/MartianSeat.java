package org.example.model;

public class MartianSeat extends Seat {
    public MartianSeat(String name) {
        super(name);
    }

    @Override
    public void getMeal() {
        System.out.println("Martian Food");
    }
}
