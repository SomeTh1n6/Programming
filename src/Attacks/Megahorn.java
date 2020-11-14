package Attacks;

import ru.ifmo.se.pokemon.*;

public class Megahorn extends PhysicalMove{
    public Megahorn(){
        super(Type.BUG,120,85);
    }
    @Override
    protected boolean checkAccuracy(Pokemon atk, Pokemon def){
        return true;
    }
    protected String describe() {
        return "начисто игнорирует";
    }
}
