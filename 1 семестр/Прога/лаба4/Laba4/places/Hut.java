package Laba3.places;

import Laba3.Placement;

public class Hut extends AbstractPlace {
    public Hut() {
        super(" шалаш ");
    }

    @Override
    public Placement getPlacement() {
        return null;
    }
    public String getProperty(){return " из еловых веток ";}
}
