package Attacke1;

import ru.ifmo.se.pokemon.*;

public class WildChange extends PhysicalMove {
    public WildChange(){
        super(Type.ELECTRIC,90,100);
    }
    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }

    protected void applySelfEffects(Pokemon def) {
        Effect effect1 = new Effect();
        effect1.stat(Stat.HP, +13);
        def.addEffect(effect1);
    }



    protected String describe() {
        return ":'Неаттестация по 4 предметам'" + "  Игрок:'Мне пофиг'";
    }
}
