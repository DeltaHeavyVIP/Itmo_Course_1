package Laba3.stuff;

import Laba3.beast.Beast;

public class Kolokolchik extends CommonStuff implements StuffWithAction,StuffWithProperty {
    private String action;

    public Kolokolchik() {
        super("колокольчик");
    }

    @Override
    public String getAction() {
        return " звякнул ";
    }

    @Override
    public String getProperty() {
        return "(всего один печальный звук)";
    }

    public String ringingPart1(){
        return this + this.getAction() + this.getProperty() + ", и ";
    }

    public String ringingPart2(Beast aphiliphonka){return "Обычно звон " + this + "a" + " подбадривал " + aphiliphonka;}

    public String ringingPart0(){return " и тогда " +this +", украшавший кончик ее колпачка, позвякивал.";}

    public String shutOf(){return this + " , звеневший в тумане, умолк.";}

}
