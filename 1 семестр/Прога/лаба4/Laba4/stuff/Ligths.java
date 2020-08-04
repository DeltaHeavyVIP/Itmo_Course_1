package Laba3.stuff;

import Laba3.Placement;
import Laba3.places.AbstractPlace;

public class Ligths extends CommonStuff implements StuffWithPlacement {
    private AbstractPlace place;
    private Placement placement;

    public Ligths(AbstractPlace place,Placement placement) {
        super("гирлянды листьев");
        this.place=place;
        this.placement =placement;
    }

    public AbstractPlace getPlace() {
        return this.place;
    }

    @Override
    public Placement getPlacement() {
        return this.placement;
    }
}
