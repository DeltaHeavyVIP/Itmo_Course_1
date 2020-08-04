package Laba3.stuff;

import Laba3.Placement;
import Laba3.places.AbstractPlace;

public class Flowers extends CommonStuff implements StuffWithPlacement {
    private Placement placement;
    private AbstractPlace place;

    public Flowers(Placement placement,AbstractPlace place) {
        super("цветы");
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

    public int hashCode (){
        return super.hashCode()*12-56 ;
    }


}
