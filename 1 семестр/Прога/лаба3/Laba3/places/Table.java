package Laba3.places;

import Laba3.Placement;

public class Table extends AbstractPlace  {
    public Table() {
        super("стол");
    }

    @Override
    public Placement getPlacement() {
        return Placement.On;
    }
}