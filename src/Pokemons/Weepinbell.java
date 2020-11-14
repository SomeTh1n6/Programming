package Pokemons;

import ru.ifmo.se.pokemon.*;
import Attacks.*;

public class Weepinbell extends Bellsprout{
    public Weepinbell(String name, int level){
        super(name,level);
        setStats(65,90,50,85,45,55);
        setType(Type.GRASS,Type.POISON);
        setMove(new Venoshock(), new SwordsDance(), new StunSpore());
    }
}
