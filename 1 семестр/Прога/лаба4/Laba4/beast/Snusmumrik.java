package Laba3.beast;

import Laba3.myException.NamingException;
import Laba3.myException.NumberException;
import Laba3.places.AbstractPlace;
import Laba3.places.Door;

public class Snusmumrik extends Beast {

    public Snusmumrik() throws NamingException {
        super("Снусмумрик");
    }

    public String endBuild(AbstractPlace ahut, String ahutproperty , int number ) {
        if (number > 0){
        return " кончил строить" + ahut + ahutproperty + "для своих " + number +" малышей.";
        } else
            {throw new NumberException ("Выбери другое количесво детей!");}
    }
    public static class Someone  {

        public String name = " кто-то ";


        public String bang(Door adoor){
            return " И вот тогда" + this + "постучал в " + adoor + " .";
        }
        public String toString(){
            return this.name;
        }
    }
}
