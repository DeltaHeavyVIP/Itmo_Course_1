package Laba3.beast;

import Laba3.myException.NamingException;

public class They extends Beast implements BeastWithProperty {
    public They() throws NamingException {
        super("Они");
    }
    public String willNotGo(){
        return " и в этом году не придут!";
    }

    @Override
    public String getProperty() {
        return "У них нет никаких родственных чувств!";
    }
    public String dontGo(){
        return "и никто не приходит.";
    }
}
