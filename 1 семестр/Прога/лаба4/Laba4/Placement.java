package Laba3;

public enum Placement {
    On(" на "),
    Over(" над ");
    String name;
    Placement(String name) {
        this.name = name;
    }
    public String toString(){
        return name;
    }
}