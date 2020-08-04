package Attacke1;

import ru.ifmo.se.pokemon.*;

public class Agility extends StatusMove {
    public Agility(){
        super(Type.PSYCHIC,0,0);
    }
    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }

    protected void applySelfEffects(Pokemon att){
        Effect effect = new Effect();
        effect.stat(Stat.SPEED, +2);
        att.addEffect(effect);
    }

    protected String describe() {
        return "Унизила при классе";
    }
}
