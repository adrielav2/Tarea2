
import java.util.*;

public class Tablero{

    int casillas= 0;
    int jugadores= 4;
    List<Ficha> Orden;

    public Tablero(int casillas1){
        casillas=casillas1;

    }

    public void Turnos(){
        Ficha jugador1 = new Ficha("Azul");
        Ficha jugador2 = new Ficha("Rojo");
        Ficha jugador3 = new Ficha("Amarillo");
        Ficha jugador4 = new Ficha("Naranja");
        Orden = new ArrayList<Ficha>();
        Orden.add(jugador1);
        Orden.add(jugador2);
        Orden.add(jugador3);
        Orden.add(jugador4);
        Collections.shuffle(Orden);
    }
}