package Laba3.places;

import Laba3.Placement;

public class Door extends AbstractPlace{

    public Door() {
        super("дверь");
    }

    public Placement getPlacement() {
        return Placement.Over;
    }

    public Placement getPlacementOn() {
        return Placement.On;
    }
}
