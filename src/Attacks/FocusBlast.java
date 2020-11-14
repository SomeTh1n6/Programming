package Attacks;

import ru.ifmo.se.pokemon.*;

public class FocusBlast extends SpecialMove{
    public FocusBlast(){
        super(Type.FIGHTING,120,70);
    }
    @Override
    protected boolean checkAccuracy(Pokemon atk, Pokemon def){
        return true;
    }
    protected void applyOppEffects(Pokemon def){
        Effect e = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE,-1);
        def.addEffect(e);
    }
    protected String describe() {
        return "забил на урок";
    }

}
