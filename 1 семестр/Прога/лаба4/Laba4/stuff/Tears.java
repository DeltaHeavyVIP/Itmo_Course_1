package Laba3.stuff;

public class Tears extends CommonStuff implements StuffWithAction,StuffWithProperty {
    private String action;
    private static int i=1 ;

    public Tears() {
        super("слезы");
    }

    @Override
    public String getAction() {
        return "закапали";
    }

    @Override
    public String getProperty() {
        return " медленно ";
    }

    public static int inDish(){
        i = (int) (i + Math.random()*5);
        return i;
    }
    public String dropTo(TearsAcceptor adish){
        return adish.getPlacement() + adish.getProperty() + adish.toString()+" . ";
    }
}