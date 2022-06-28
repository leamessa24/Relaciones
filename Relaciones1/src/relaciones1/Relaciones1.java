/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
package relaciones1;


public class Relaciones1 {

    
    public static void main(String[] args) {
       Perro a1 = new Perro();
       Perro a2 = new Perro();
       Persona b1 = new Persona();
       Persona b2 = new Persona();
       
       a1.crearPerro();
       b1.crearPersona();
      a2.crearPerro();
       b2.crearPersona();
       b1.setAdopta(a1);
       b2.setAdopta(a2);
       b1.mostrar();
       b2.mostrar();
       
        
      
       
       
      
    }
    
}
