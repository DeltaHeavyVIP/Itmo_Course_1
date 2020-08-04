package Laba3.timе;

public class Time extends TimeOfDay implements DayWithProperty {
    public Time() {
        super(" время  ");
    }

    @Override
    public String getProperty() {
        return "В то же самое";
    }

    public String go(){ return " идет "; }

    public String went(){return "шло.";}
}
