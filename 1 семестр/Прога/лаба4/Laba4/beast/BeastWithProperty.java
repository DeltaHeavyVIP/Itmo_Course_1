package Laba3.beast;

public interface BeastWithProperty {
    String getProperty();

    default String freez(){
        return " замерли на месте ";
    }

    default String listen(){
        return ", прислушиваясь.";
    }
}
