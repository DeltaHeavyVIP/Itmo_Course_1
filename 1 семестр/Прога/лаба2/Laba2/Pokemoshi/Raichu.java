package Pokemoshi;

import Attacke1.WildChange;
import ru.ifmo.se.pokemon.Type;

public class Raichu extends Pickachu {
    public Raichu(String name, int level){
        super(name, level);

        this.setStats(60,90,55,90,80,110);
        this.setType(Type.ELECTRIC);

        this.setMove(new WildChange());

    }
}