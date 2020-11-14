package Attacks;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove{
    public DoubleTeam(){
        super(Type.NORMAL,0,0);
    }

    @Override
    protected boolean checkAccuracy(Pokemon atk, Pokemon def){
        return true;
    }
    public void applySelfEffects (Pokemon atk){
        atk.setMod(Stat.EVASION, 1);
    }

    protected String describe() {
        return "неуважительно ушел с урока";
    }

}
