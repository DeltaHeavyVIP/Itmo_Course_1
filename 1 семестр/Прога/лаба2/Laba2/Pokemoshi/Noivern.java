package Pokemoshi;

import Attacke1.Flamethrower;
import ru.ifmo.se.pokemon.Type;

public class Noivern extends Noibat {
    public Noivern(String name, int level){
        super(name, level);

        this.setStats(85,70,80,97,80,123);
        this.setType(Type.DRAGON);

        this.setMove(new Flamethrower());

    }
}
