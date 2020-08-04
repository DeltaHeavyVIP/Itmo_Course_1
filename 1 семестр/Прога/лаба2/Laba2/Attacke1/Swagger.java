package Attacke1;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger(){
        super(Type.NORMAL,0,85);
    }
    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }

    protected void applySelfEffects(Pokemon def){
        Effect effect = new Effect();
        effect.chance(0.33);
        effect.confuse(def);
        int q= (int)(Math.random()*4.3);
        effect.turns(q);
        effect.stat(Stat.ATTACK, +2);
        effect.stat(Stat.DEFENSE, +2);
        effect.stat(Stat.SPECIAL_ATTACK, +2);
        effect.stat(Stat.SPECIAL_DEFENSE, +2);
        effect.stat(Stat.SPEED, +2);
        def.addEffect(effect);
    }

    protected String describe() {
        return "А вы уверены, что ваше решение правильное?";
    }
}
