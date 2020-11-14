package Attacks;

import ru.ifmo.se.pokemon.*;
public class Bulldoze extends PhysicalMove {
    public Bulldoze(){
        super(Type.GROUND,60,100);
    }
    @Override
    protected boolean checkAccuracy(Pokemon atk, Pokemon def){
        return true;
    }
    protected void applyOppEffects(Pokemon def){
        def.setMod(Stat.SPECIAL_ATTACK,-1);
        def.setMod(Stat.SPEED,-1);
    }
    protected String describe() {
        return "жмыхнул не по детски";
    }

}
