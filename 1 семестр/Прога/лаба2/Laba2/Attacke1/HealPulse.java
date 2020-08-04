package Attacke1;

import ru.ifmo.se.pokemon.*;

public class HealPulse extends StatusMove {
    public HealPulse(){super(Type.PSYCHIC,0,0);}

    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }

    protected void applySelfEffects(Pokemon att){
        Effect effect = new Effect();
        effect.stat(Stat.HP, +14);
        att.addEffect(effect);
    }

    protected String describe()
    {
        return "Смотрю сериальчик ";
    }
}
