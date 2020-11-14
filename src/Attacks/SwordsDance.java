package Attacks;

import ru.ifmo.se.pokemon.*;

public class SwordsDance extends StatusMove {
    public SwordsDance(){
        super(Type.NORMAL,0,0);
    }
    @Override
    protected boolean checkAccuracy(Pokemon atk, Pokemon def){
        return true;
    }
    public void applySelfEffects(Pokemon atk) {
        atk.setMod(Stat.ATTACK,+2);
    }
    protected String describe() {
        return "устраивает внезапную проверочную";
    }
}
