package org.example.model;

public class HumanSeat extends Seat {
    public HumanSeat(String name) {
        this(name,new Pluto(true));
    }

    public HumanSeat(String name,Pluto pluto){
        super(name);
        this.pluto = pluto;
    }

    @Override
    public void getMeal() {
        System.out.println("Human Food");
    }

}
