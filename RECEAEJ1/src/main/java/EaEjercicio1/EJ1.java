/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */


package EaEjercicio1;

import Entidad.Perro;
import Entidad.Persona;
import Servicio.PerroServicio;
import Servicio.PersonaServicio;
import Utils.TestAsker;

import java.util.ArrayList;

public class EJ1 {

    static PerroServicio prs = new PerroServicio(new TestAsker(System.in,System.out));
    static PersonaServicio ps = new PersonaServicio(new TestAsker(System.in,System.out));
    public static void main(String[] args) {

        ArrayList<Persona> pna = new ArrayList();
        
        for (int i = 0; i <= 2; i ++) {
            Perro pr = prs.crearPerro();
            pna.add(ps.crearPersona(pr)); 
        }

        for (Persona auxp : pna) {
            System.out.println(auxp.toString());
        }

    }



}
