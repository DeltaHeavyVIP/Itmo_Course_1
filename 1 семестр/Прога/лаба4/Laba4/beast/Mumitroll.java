package Laba3.beast;

import Laba3.myException.NamingException;

public class Mumitroll extends Beast implements BeastWithProperty {
    public Mumitroll() throws NamingException {
        super("Муми-тролль");
    }

    @Override
    public String getProperty() { return " замерли на месте, прислушиваясь."; }
}
