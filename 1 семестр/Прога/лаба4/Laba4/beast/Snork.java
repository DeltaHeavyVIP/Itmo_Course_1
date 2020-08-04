package Laba3.beast;

import Laba3.Placement;
import Laba3.myException.NamingException;
import Laba3.places.AbstractPlace;
import Laba3.stuff.Ligths;

public class Snork extends Beast implements BeastWithProperty {

    public Snork() throws NamingException {
        super("фрекен Снорк");
    }

    public String look(Placement aplacement,String tableproperty, AbstractPlace atable, Placement aplacement1, Ligths aligths, Placement aplacement2, AbstractPlace adoor){
        return this + "взглянула" + aplacement + tableproperty + atable + " и" + aplacement1 + aligths + aplacement2 + adoor ;
    }

    @Override
    public String getProperty() {
        return null;
    }
}
