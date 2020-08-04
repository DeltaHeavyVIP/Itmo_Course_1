package Laba3.places;

import Laba3.Placement;

public abstract class AbstractPlace {
    String name;

    protected AbstractPlace(String nameplace) {
        name=nameplace;
    }

    public abstract Placement getPlacement();

    public String toString(){
        return name;
    }
}