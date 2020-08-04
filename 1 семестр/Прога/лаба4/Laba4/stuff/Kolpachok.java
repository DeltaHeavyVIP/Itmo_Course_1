package Laba3.stuff;

public class Kolpachok extends CommonStuff implements StuffWithAction {
    private String action;

    public Kolpachok() {
        super("Колпачок");
    }

    @Override
    public String getAction() {
        return " съехал ей ";
    }

    public String went(Go aforeHead){
        return this + this.getAction()+ aforeHead.getPlacement()+ aforeHead + ", так что ";
    }
}
