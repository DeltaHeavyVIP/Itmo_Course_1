package Laba3.stuff;

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
    public String ringing(){
        return this + this.getAction() + this.getProperty() + ", и ";
    }
}
