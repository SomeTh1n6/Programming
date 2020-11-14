package Attacks;

import ru.ifmo.se.pokemon.*;

public class StunSpore extends StatusMove{
    public StunSpore(){
        super(Type.GRASS,0,75);
    }
    @Override
    protected boolean checkAccuracy(Pokemon atk, Pokemon def){
        return true;
    }
    public void applyOppEffects(Pokemon def) {
        if  (def.hasType(Type.ELECTRIC) == false ){
            Effect.paralyze(def);}
    }
    protected String describe() {
        return "ясно , быдло";
    }

}
