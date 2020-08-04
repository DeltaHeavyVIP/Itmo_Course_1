package Attacke1;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Flamethrower extends SpecialMove {
    public Flamethrower(){
        super(Type.FIRE,90,100);
    }
    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }

    protected void applySelfEffects(Pokemon def){
        Effect effect = new Effect();
        effect.chance(0.1);
        effect.burn(def);
        def.addEffect(effect);
    }

    protected String describe() {
        return "Ваши уроки бесполезны, они вообще никак и ничем не помогают, вы просто получаете бабки";
    }
}
