package Pokemons;

import ru.ifmo.se.pokemon.*;
import Attacks.*;

public class Drilbur extends Pokemon{
    public Drilbur (String name , int level){
        super(name, level);
        setStats(60,85,40,30,45,68);
        setType(Type.GROUND);
        setMove(new SludgeBomb(), new Bulldoze(), new Swagger());
    }
}
