package Attacke1;

import ru.ifmo.se.pokemon.*;

public class ThunderShock extends SpecialMove {
    public ThunderShock(){
        super(Type.ELECTRIC,40,100);
    }
    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }

    protected void applySelfEffects(Pokemon def){
        Effect effect = new Effect();
        effect.chance(0.1);
        effect.paralyze(def);
        def.addEffect(effect);
    }

    protected String describe() {
        return "рассказывает о будушем";
    }
}
