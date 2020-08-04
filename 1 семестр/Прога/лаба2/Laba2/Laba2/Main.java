package Laba2;
import Pokemoshi.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main (String [] args){
        Battle b = new Battle();
        //команда 1
        Pokemon player1 = new Alomomla("Вова", 1);
        Pokemon player2 = new Noibat("Саня", 1);
        Pokemon player3 = new Noivern("Настя", 1);
        //команда 2
        Pokemon player4 = new Pichu("физичка", 1);
        Pokemon player5 = new Pickachu("математичка ", 1);
        Pokemon player6 = new Raichu("ЧИШ", 1);

        b.addAlly(player1);
        b.addAlly(player2);
        b.addAlly(player3);

        b.addFoe(player4);
        b.addFoe(player5);
        b.addFoe(player6);


        b.go();

    }
}