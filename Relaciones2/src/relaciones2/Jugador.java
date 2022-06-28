
package relaciones2;


public class Jugador {
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.mojado= true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public Jugador() {
    }
    
    public boolean disparo(Revolver r){
        boolean resultado;
        if (r.mojar()){
           mojado = false;//el jugador se moja
           resultado = true;  
        }else {
         r.siguienteChorro();
         resultado = false;
        }
        return resultado;
    }

    @Override
    public String toString() {
        return id + " ID Jugador " + nombre + " mojado? " + mojado;
    }
    
    
}
