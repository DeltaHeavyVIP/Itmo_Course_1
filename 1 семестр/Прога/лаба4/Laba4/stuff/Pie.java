package Laba3.stuff;

public class Pie extends CommonStuff implements StuffWithProperty {

    public Pie(){
        super("Пирог ");
    }
    @Override
    public String getProperty() {
        return "сохнет, ";
    }
}
