
package relaciones3;

public class Baraja {
    
    private Carta cartita[];
    private int siguienteCartita;
    
    public static final int NUM_CARTAS=40;


    public Baraja() {
        this.cartita = new Carta[NUM_CARTAS];
        this.siguienteCartita = 0;
        crearBaraja();
        barajar();
    }

   private void crearBaraja(){
       String[] palos=Carta.PALOS;
       
       for (int i = 0; i < palos.length; i++) {
           for (int j = 0; j < Carta.LIMITE_CARTA_PALO; j++) {
               if(!(j==7 || j==8)){
                   if (j>=9){
                       cartita[((i * (Carta.LIMITE_CARTA_PALO-2)) + (j-2))] = new Carta(j+1, palos[i]);
                   }else{
                       cartita[((i * (Carta.LIMITE_CARTA_PALO-2)) + j)] = new Carta(j+1, palos[i]);
                   }
               }
           }
       }
   }
    
    public void barajar(){
        int posAleatorio=0;
        Carta c;
        for (int i = 0; i < cartita.length ; i++) {
            posAleatorio = Carta.generaNumeroEnteroAleatorio(0,NUM_CARTAS-1);
             c = cartita[i];
             cartita[i]= cartita[posAleatorio];
             cartita[posAleatorio]= c;
        }
    }
    
    public Carta siguienteCarta(){
        Carta c = null;
        if(siguienteCartita == NUM_CARTAS){
            System.out.println("Ya no hay mas cartas, barajea de nuevo");   
        }else{
            c = cartita[siguienteCartita++]; 
        }
        return c;
    }
    
    public int cartasDisponibles(){
        return NUM_CARTAS-siguienteCartita;
    }
    
    public Carta[] darCartas(int numCartas){
        if (numCartas< NUM_CARTAS){
            System.out.println("No es posible dar mas cartas de las que hay"); 
           
        }else{
           if(cartasDisponibles() < numCartas){
               System.out.println("No hay suficientes cartas para mostrar");
               
           }else{
               Carta[] cartasDar = new Carta[numCartas];
               for (int i = 0; i < cartasDar.length; i++) {
                   cartasDar[i]= siguienteCarta();
               }
               return cartita;
           }
        }
        return null;    
    }
    
    public void cartasMonton(){
        if(cartasDisponibles() == NUM_CARTAS){
            System.out.println("No se a sacado ninguna carta");
        }else{
            for (int i = 0; i < siguienteCartita; i++) {
                System.out.println(cartita[i]);
            }
        }
    }
    
    public void mostrarBaraja(){
        if(cartasDisponibles() == 0){
            System.out.println("No hay cartas que mostrar");
        }else{
            for (int i = siguienteCartita; i < cartita.length ; i++) {
                System.out.println(cartita[i]);
            }
        }
    }
}
