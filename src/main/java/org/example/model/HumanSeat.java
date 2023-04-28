package org.example.model;

public class HumanSeat extends Seat {
    public HumanSeat(String name) {
        super(name);
    }

    @Override
    public void getMeal() {
        System.out.println("Human Food");
    }

}
