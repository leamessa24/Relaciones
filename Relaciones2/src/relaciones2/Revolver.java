
package relaciones2;


public class Revolver {
    private int posicionDisparo;
     private int posicionAgua;

    public Revolver() {
    }

    public Revolver(int posicionDisparo, int posicionAgua) {
        this.posicionDisparo = posicionDisparo;
        this.posicionAgua = posicionAgua;
    }

    public double getPosicionDisparo() {
        return posicionDisparo;
    }

    public void setPosicionDisparo(int posicionDisparo) {
        this.posicionDisparo = posicionDisparo;
    }

    public double getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    public void llenarRevolver(){
        int min = 1;
        int max = 6;
        posicionDisparo = (int) (Math.random()*(max-min));
        posicionAgua = (int) (Math.random()*(max-min));
        
    }
    public boolean mojar(){
        boolean result;
        System.out.println("Disparo en " +posicionDisparo+ " y posicion de la carga en "+ posicionAgua);
        if (posicionDisparo == posicionAgua){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
    
    public void siguienteChorro(){
        posicionDisparo ++ ; 
        
        if (posicionDisparo > 5 ){
            posicionDisparo = 0;
        }
    }

    @Override
    public String toString() {
        return "Revolver " + "posicionDisparo " + posicionDisparo + ", posicionAgua " + posicionAgua + '}';
    }
    
    
}
