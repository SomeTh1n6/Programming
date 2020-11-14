import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import Pokemons.*;
import Attacks.*;

public class Main {
    public static void main (String [] args) {
        Battle b = new Battle();
        Pokemon p1 = new Xerneas("Толя", 10);
        Pokemon p2 = new Excadrill("Саша", 10);
        Pokemon p3 = new Drilbur("Леша Куз ака трасформаторная будка (термоядерный)", 10);
        Pokemon p4 = new Victreebel("Русичка", 10);
        Pokemon p5 = new Weepinbell("Химичка", 10);
        Pokemon p6 = new Bellsprout("Мотемотичка", 10);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}

