package Attacks;

import ru.ifmo.se.pokemon.*;

public class Moonblast extends SpecialMove{
    public Moonblast(){
        super(Type.FAIRY,95,100);
    }
    @Override
    protected boolean checkAccuracy(Pokemon atk, Pokemon def){
        return true;
    }
    protected void applyOppEffects(Pokemon def){
        Effect e = new Effect().chance(0.3).stat(Stat.SPECIAL_ATTACK, -1);
        def.addEffect(e);
    }
    protected String describe() {
        return "включает максимальный игнор";
    }
}
