package Laba3.places;

import Laba3.Placement;
import Laba3.stuff.Go;

public class Table extends AbstractPlace implements Go {
    public Table() {
        super("стол");
    }

    @Override
    public Placement getPlacement() {
        return Placement.On;
    }


    @Override
    public String getAction() {
        return null;
    }

    @Override
    public String getProperty() {
        return " накрытый ";
    }
}