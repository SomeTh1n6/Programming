package Pokemons;

import ru.ifmo.se.pokemon.*;
import Attacks.*;

public class Victreebel extends Weepinbell{
    public Victreebel(String name, int level){
        super(name,level);
        setStats(80,105,65,100,70,70);
        setType(Type.GRASS, Type.POISON);
        setMove(new Venoshock(), new SwordsDance(), new StunSpore(), new Confide() );
    }
}
