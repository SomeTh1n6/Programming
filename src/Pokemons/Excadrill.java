package Pokemons;

import ru.ifmo.se.pokemon.*;
import Attacks.*;

public class Excadrill extends Drilbur{
    public Excadrill(String name, int level){
        super(name,level);
        setStats(110, 135, 60, 50, 65, 88);
        setType(Type.GROUND, Type.STEEL);
        setMove(new SludgeBomb(), new Bulldoze(), new Swagger(), new FocusBlast());
    }
}
