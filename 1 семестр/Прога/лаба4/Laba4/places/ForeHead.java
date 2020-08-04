package Laba3.places;

import Laba3.Placement;
import Laba3.stuff.Go;

public class ForeHead extends AbstractPlace implements Go {
    public ForeHead() {
        super("лоб");
    }

    public AbstractPlace getPlace() {
        return null;
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
        return null;
    }
}
