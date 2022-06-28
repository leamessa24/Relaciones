
package relaciones1;

import java.util.Scanner;


public class Persona {
    private String nombre2;
    private String apellido;
    private int edad;
    private long documento;
    private Perro adopta;

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public Perro getAdopta() {
        return adopta;
    }

    public void setAdopta(Perro adopta) {
        this.adopta = adopta;
    }

    public Persona(String nombre2, String apellido, int edad, long documento, Perro adopta) {
        this.nombre2 = nombre2;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.adopta = adopta;
    }

    public Persona() {
    }
    
    public void crearPersona(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
            System.out.println("INGRESE EL NOMBRE DE LA PERSONA:");
            nombre2 = leer.next();
            System.out.println("INGRESE EL APELLIDO DE LA PERSONA:");
            apellido = leer.next();
            System.out.println("INGRESE LA EDAD DE LA PERSONA");
            edad = leer.nextInt();
            System.out.println("INGRESE EL NUMERO DE DOCUMENTO");
            documento = leer.nextLong();
            
            
    }
    
   public void mostrar(){
       System.out.println("LA PERSONA DE NOMBRE "+ nombre2 + " Y APELLIDO "+ apellido+
               " DE "+ edad + " AÑOS DE EDAD, CON DOCUMENTO NUMERO: "+ documento+
               " ADOPTA A: "+ adopta.getNombre()+ " DE RAZA: "+ adopta.getRaza()+" Y TAMAÑO DE: "+ adopta.getTamano()+" CM DE ALTURA Y "
       + adopta.getEdad()+" AÑOS DE EDAD");
   }
}
