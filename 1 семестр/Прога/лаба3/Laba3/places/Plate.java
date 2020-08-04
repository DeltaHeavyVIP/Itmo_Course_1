package Laba3.places;

import Laba3.Placement;

public class Plate extends AbstractPlace {

    public Plate() {
        super("плита");
    }

    @Override
    public Placement getPlacement() {
        return Placement.On;
    }
}