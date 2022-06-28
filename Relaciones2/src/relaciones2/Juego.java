
package relaciones2;

import java.util.ArrayList;

public class Juego {
    
    private Revolver r;
    private ArrayList <Jugador> listaJugadores;

    public Juego() {
    }
    
    public void llenarJuego(ArrayList<Jugador>jugadores, Revolver r){
        this.listaJugadores = jugadores;
        this.r = r;
    }
    public void ronda(){
        for (Jugador i : listaJugadores){
          if (i.disparo(r)){
              System.out.println("Se mojo el jugador "+ i.getNombre() );
              break;
          }else {
              System.out.println("El jugador "+ i.getNombre()+ " no se mojo");
          }
        }
        System.out.println("EL JUEGO A FINALIZADO");
    }
    
}
