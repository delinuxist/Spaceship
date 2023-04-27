package org.example.model;

import java.util.HashMap;
import java.util.Map;

public abstract class Seat {

    protected static int count = 0;
    protected Integer ID;
    protected String name;

    protected Pluto pluto;

    protected Seat(String name) {
        count++;
        this.ID = count;
        this.name = name;
    }

    protected abstract void getMeal();

    public String getName() {
        return name;
    }

    public Integer getID() {
        return ID;
    }
}
