package Attacke1;

import ru.ifmo.se.pokemon.*;

public class CalmMind extends StatusMove {
    public CalmMind(){super(Type.PSYCHIC,0,0);}

    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }

    protected void applySelfEffects(Pokemon att){
        Effect effect = new Effect();
        effect.stat(Stat.SPECIAL_ATTACK, +1);
        effect.stat(Stat.SPECIAL_DEFENSE, +1);
        att.addEffect(effect);
    }

    protected String describe()
    {
        return "Иду к Тыну";
    }
}
