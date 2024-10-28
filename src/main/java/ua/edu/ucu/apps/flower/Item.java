package ua.edu.ucu.apps.flower;

import lombok.Getter;

@Getter
public abstract class Item {

    protected String description;

    public abstract double getPrice();

}
