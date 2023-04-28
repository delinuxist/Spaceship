package org.example.model;

public class Pluto {
    boolean isPlutoAMoon;

    public Pluto(boolean isPlutoAMoon){
        this.isPlutoAMoon = isPlutoAMoon;
    }

    public void whatIsPluto() {
        if(isPlutoAMoon){
            System.out.println("Pluto is a moon");
        }else {
            System.out.println("Pluto is a planet");
        }
    }
}
