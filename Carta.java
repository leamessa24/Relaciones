
package relaciones3;


public class Carta {
    private int numero;
    private String palo;

    public static final String[] PALOS={"ESPADA","COPA","BASTO","ORO"};
    public static final int LIMITE_CARTA_PALO=12;
    
  
    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }
    public static int generaNumeroEnteroAleatorio(int minimo, int maximo) {
        int num = (int) (Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
        return num;
    }
    @Override
    public String toString() {
        return "NUMERO " + numero + " PALO " + palo;
    }
    
    
    
}
