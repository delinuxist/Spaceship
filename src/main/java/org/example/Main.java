package org.example;

import org.example.model.HumanSeat;
import org.example.model.MartianSeat;
import org.example.model.Seat;
import org.example.model.Spaceship;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        var m1 = new MartianSeat("Rogue");
        var h1 = new HumanSeat("Samson");
        var h2 = new HumanSeat("Rick");
        var m2 = new MartianSeat("Smoke");
        var h3 = new HumanSeat("Mortie");

        var sp1 = new Spaceship(10);
        sp1.bookSeat(m1);
        sp1.bookSeat(h1);
        sp1.bookSeat(h2);
        sp1.bookSeat(m2);

        var sp2 = new Spaceship(4);
        sp2.bookSeat(List.of(m1,h1,h2,h1));

//        sp2.removePassenger(List.of(m1,m2,h2));

        System.out.println("<<Check booked >>");
        for (Map.Entry<Integer,Boolean> i : sp2.isBooked(List.of(m1,h2 ,h3)).entrySet()){
            System.out.println(i);
        }


        System.out.println("<< sp 1 >>");
        for (Map.Entry<Integer,Seat> i: sp1.getSeats().entrySet()){
            System.out.println("key: "+i.getKey()+" "+"value: "+ i.getValue().getName());
        }

        System.out.println("<< sp 2 >>");
        for (Map.Entry<Integer,Seat> i: sp2.getSeats().entrySet()){
            System.out.println("key: "+i.getKey()+" "+"value: "+i.getValue().getName());
        }

        System.out.println(m2.equals(m2));
    }
}