package Laba3.places;

import Laba3.Placement;

public class House extends AbstractPlace {
    public House() {
        super("домик ");
    }

    @Override
    public Placement getPlacement() {
        return null;
    }
    public String look(){return "печально смотрел на них своими черными окошками.";}
    public String getProperty(){return ", а маленький ";}
}
