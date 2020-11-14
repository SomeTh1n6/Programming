package Pokemons;

import ru.ifmo.se.pokemon.*;
import Attacks.*;

public class Xerneas extends Pokemon{
    public Xerneas (String name , int level){
        super(name,level);
        setStats(126,131,95,131,98,99);
        setType(Type.FAIRY);
        setMove(new DoubleTeam(),new Rest(), new Moonblast(), new Megahorn());
    }
}

