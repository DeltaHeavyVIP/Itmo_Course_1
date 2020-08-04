package Pokemoshi;

import Attacke1.Blizzard;
import Attacke1.CalmMind;
import Attacke1.HealPulse;
import Attacke1.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Alomomla extends Pokemon {
    public Alomomla(String name, int level){
        super(name, level);

        this.setStats(165,75,80,40,45,65);
        this.setType(Type.WATER);

        this.setMove(new Blizzard(), new Swagger(), new CalmMind(), new HealPulse());

    }
}
