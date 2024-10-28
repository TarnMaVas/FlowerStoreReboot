package ua.edu.ucu.apps.flower;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Item {

    private String description;

    public abstract double getPrice();

}
