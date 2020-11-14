package Pokemons;

import ru.ifmo.se.pokemon.*;
import Attacks.*;

public class Bellsprout extends Pokemon{
    public Bellsprout (String name, int level){
        super(name,level);
        setStats(50,75,35,70,30,40);
        setType(Type.GRASS, Type.POISON);
        setMove(new Venoshock(), new SwordsDance());
    }
}
