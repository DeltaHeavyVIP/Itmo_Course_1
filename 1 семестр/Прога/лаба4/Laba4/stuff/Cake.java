package Laba3.stuff;

import Laba3.Placement;
import Laba3.places.AbstractPlace;

public class Cake extends CommonStuff implements StuffWithPlacement,StuffWithProperty {
    private Placement placement;
    private AbstractPlace place;
    private boolean live;

    public Cake(Placement placement, AbstractPlace place, boolean live) {
        super("кекс");
        this.placement=placement;
        this.place=place;
        this.live =live;
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
        return " совершенно почерневший от ожидания.";
    }

    public String toString() {
        if (this.live == true) {
            return " , а" + this.placement + this.place + " стоял " + getName() + "," + getProperty(); }
        else {
            return " , а" + this.placement + this.place + " стоял " + getName() + "," + getProperty() + " ,в конечном случае разложившись"; }
        }
}