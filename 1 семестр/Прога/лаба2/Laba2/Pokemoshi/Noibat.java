package Pokemoshi;

import Attacke1.AirSlash;
import Attacke1.Supersonic;
import Attacke1.Tackle;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Noibat extends Pokemon {
    public Noibat(String name, int level){
        super(name, level);

        this.setStats(40,30,35,45,40,55);
        this.setType(Type.DRAGON);

        this.setMove(new Supersonic(), new Tackle(), new AirSlash());

    }
}

