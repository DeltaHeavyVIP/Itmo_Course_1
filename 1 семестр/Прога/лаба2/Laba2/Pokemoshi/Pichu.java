package Pokemoshi;

import Attacke1.DoubleTeam;
import Attacke1.ThunderShock;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Pichu extends Pokemon {
    public Pichu(String name, int level){
        super(name, level);

        this.setStats(20,40,15,35,35,60);
        this.setType(Type.ELECTRIC);

        this.setMove(new ThunderShock(), new DoubleTeam());

    }
}

