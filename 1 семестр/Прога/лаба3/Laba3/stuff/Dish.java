package Laba3.stuff;

import Laba3.Placement;
import Laba3.places.AbstractPlace;

public class Dish extends CommonStuff implements TearsAcceptor{
    private Placement placement;
    private AbstractPlace place;

    public Dish(Placement placement,AbstractPlace place) {
        super("тарелки");
        this.placement=placement;
        this.place=place;
    }

    public AbstractPlace getPlace() {
        return this.place;
    }

    @Override
    public Placement getPlacement() {
        return this.placement;
    }

    @Override
    public String getProperty() {
        return "пустую ";
    }

    @Override
    public String getAction() {
        return null;
    }
}
