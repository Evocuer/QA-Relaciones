package Servicio;

import Entidad.Perro;
import Entidad.Persona;
import Utils.TestAsker;

public class PersonaServicio {

    TestAsker leer;

    public PersonaServicio (TestAsker Leer) {this.leer = leer;}

    public Persona crearPersona(Perro p1) {

        Persona p = new Persona();

        String nombre = leer.stringAsk("Ingrese el nombre");
        p.setNombre(nombre);
        String apellido = leer.stringAsk("Ingrese el apellido");
        p.setApellido(apellido);
        Integer edad = leer.intAsk("Ingrese la edad");
        p.setEdad(edad);
        String id = leer.stringAsk("Ingrese la id");
        p.setId(id);
        p.setPerro(p1);

        return p;
    }

}
