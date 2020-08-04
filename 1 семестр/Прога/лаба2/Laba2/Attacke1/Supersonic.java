package Attacke1;

import ru.ifmo.se.pokemon.*;

public class Supersonic extends StatusMove {
    public Supersonic(){
        super(Type.NORMAL,0,55);
    }
    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }

    protected void applySelfEffects(Pokemon def){
        Effect effect = new Effect();
        effect.chance(0.33);
        int q= (int)(Math.random()*4.3);
        effect.turns(q);
        effect.confuse(def);
        def.addEffect(effect);
    }

    protected String describe() {
        return "А вы знали, что можно решить это проще?";
    }
}
