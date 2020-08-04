package Attacke1;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class AirSlash extends SpecialMove {
    public AirSlash(){
        super(Type.FLYING,75,95);
    }
    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }

    protected void applySelfEffects(Pokemon def){
        Effect effect = new Effect();
        effect.chance(0.3);
        effect.flinch(def);
        def.addEffect(effect);
    }

    protected String describe() {
        return "Почти выиграл олимпиаду!";
    }
}
