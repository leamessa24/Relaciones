
package relaciones2;

import java.util.ArrayList;
import java.util.Scanner;

public class Relaciones2 {
    public static void main(String[] args) {
    Revolver a1 = new Revolver();
    a1.llenarRevolver();
    Scanner leer = new Scanner(System.in);
    ArrayList <Jugador> listaJugadores = new ArrayList();
    int i = 0;
       while (i <=5){
           System.out.println("Ingrese el nombre del participante:");
           String name = leer.next();
           System.out.println("Ingrese ID del participante: ");
           int id = leer.nextInt();
           Jugador j1 = new Jugador(id,name);
           listaJugadores.add(j1);
           i++;
       }
     Juego game = new Juego();
     game.llenarJuego(listaJugadores, a1);
     game.ronda();
     
    } 
    
}       
     
    

