package Laba3.timе;

public class DayTime extends TimeOfDay implements DayWithProperty {
    public DayTime() {
        super("День");
    }

    @Override
    public String getProperty() {
        return " летнего солнцестояния";
    }

    public String exodus (){return "был на исходе.";}
}
