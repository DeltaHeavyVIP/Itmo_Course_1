package Pokemoshi;

import Attacke1.Agility;
import ru.ifmo.se.pokemon.Type;

public class Pickachu extends Pichu {
    public Pickachu(String name, int level){
        super(name, level);

        this.setStats(35,55,40,50,50,90);
        this.setType(Type.ELECTRIC);

        this.setMove(new Agility());

    }
}

