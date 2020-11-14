package Attacks;

import ru.ifmo.se.pokemon.*;

public class Venoshock extends SpecialMove{
    public Venoshock(){
        super(Type.POISON,65,100);
    }
    @Override
    protected boolean checkAccuracy(Pokemon atk, Pokemon def){
        return true;
    }
    protected double calcCriticalHit(Pokemon atk, Pokemon def){
        Status st = atk.getCondition();
        if (st == Status.POISON){
            return 2.0D;
        }
        else{
            return 1.0D;
        }
    }
    protected String describe() {
        return "Ты поступишь максимум в поликек!!11";
    }

}
