
package relaciones1;

import java.util.Scanner;


public class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private int tamano;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public Perro(String nombre, String raza, int edad, int tamano) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamano = tamano;
    }

    public Perro() {
    }
    
    public void crearPerro(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
            System.out.println("INGRESE EL NOMBRE DEL PERRO:");
            nombre = leer.next();
            System.out.println("INGRESE LA RAZA DEL PERRO:");
            raza = leer.next();
            System.out.println("INGRESE LA EDAD DEL PERRO");
            edad = leer.nextInt();
            System.out.println("INGRESE EL TAMAÑO DEL PERRO");
            tamano = leer.nextInt();
            
            
}
}
