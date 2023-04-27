package org.example;

import org.example.model.HumanSeat;
import org.example.model.MartianSeat;
import org.example.model.Seat;
import org.example.model.Spaceship;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        var m1 = new MartianSeat("Rogue");
        var h1 = new HumanSeat("Samson");
        var h2 = new HumanSeat("Rick");
        var m2 = new MartianSeat("Smoke");

        var sp1 = new Spaceship(10);
        sp1.bookSeat(m1);
        sp1.bookSeat(h1);
        sp1.bookSeat(h2);
        sp1.bookSeat(m2);

        var sp2 = new Spaceship(3);
        sp2.bookSeat(m2);
        sp2.bookSeat(h1);
        sp2.bookSeat(h2);
        sp2.bookSeat(m1);


        System.out.println("<< sp 1 >>");
        for (Map.Entry<Integer,Seat> i: sp1.getSeats().entrySet()){
            System.out.println("key: "+i.getKey()+" "+"value: "+ i.getValue().getName());
        }

        System.out.println("<< sp 2 >>");
        for (Map.Entry<Integer,Seat> i: sp2.getSeats().entrySet()){
            System.out.println("key: "+i.getKey()+" "+"value: "+i.getValue().getName());
        }
    }
}