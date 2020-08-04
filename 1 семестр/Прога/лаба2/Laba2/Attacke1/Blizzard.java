package Attacke1;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;

public class Blizzard extends SpecialMove {

    public Blizzard (){super(Type.ICE,110,70);}

    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }

    protected void applySelfEffects(Pokemon def){
        Effect effect = new Effect();
        effect.chance(0.1);
        effect.freeze(def);
        def.addEffect(effect);
    }

    protected String describe()
    {
        return "Лови задачи МГУ, которые я решаю";
    }
}
