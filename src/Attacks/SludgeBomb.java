package Attacks;

import ru.ifmo.se.pokemon.*;

public class SludgeBomb extends SpecialMove{
    public SludgeBomb(){
        super(Type.POISON,90,100);
    }
    @Override
    protected boolean checkAccuracy(Pokemon atk, Pokemon def){
        return true;
    }
    public void applyOppEffects(Pokemon def){
        if (def.hasType(Type.POISON) == false && def.hasType(Type.STEEL) == false){
            Effect e = new Effect().chance(0.3);
            e.poison(def);
        }
    }
    protected String describe() {
        return "пришел к пятому уроку";
    }
}
