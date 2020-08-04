package Laba3.places;

import Laba3.Placement;

public class Forest extends AbstractPlace {
    public Forest() {
        super(" лес ");
    }

    @Override
    public Placement getPlacement() {
        return null;
    }
    public String sleep(){return "спал";}

    public String otherSight(){return " на другом конце";}
}
