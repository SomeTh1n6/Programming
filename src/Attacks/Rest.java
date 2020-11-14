package Attacks;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest(){
        super(Type.PSYCHIC,0,100);
    }
    @Override
    protected boolean checkAccuracy(Pokemon atk, Pokemon def){
        return true;
    }
    protected void applySelfEffects(Pokemon atk){
        Effect e = new Effect();
        e = e.condition(Status.SLEEP);
        e = e.turns(2);
        atk.restore();
        atk.addEffect(e);
    }
    protected String describe(){
        return "решает поспать на уроке";
    }

}
