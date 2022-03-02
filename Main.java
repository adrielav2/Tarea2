public class Main {

    public static void main(String[] args){
        Tablero Juego= new Tablero(20);
        Juego.Turnos();
        int turno = 0;
        while(Juego.Orden.get(turno).avanzar() < Juego.casillas){
            if(turno != 3){
                turno = turno+1;
            }
            else{
                turno = 0;
            }
        }    
        System.out.println("Gana el jugador " + Juego.Orden.get(turno).color);
    }
}
