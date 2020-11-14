package Attacks;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove{
    public Swagger(){
        super(Type.NORMAL,0,85);
    }
    @Override
    protected boolean checkAccuracy(Pokemon atk, Pokemon def){
        return true;
    }
    protected void applyOppEffects(Pokemon def){
        def.setMod(Stat.ATTACK,2);
        Effect.confuse(def);
    }
    protected String describe() {
        return "поставил njRAT на ноут учителя";
    }
}
