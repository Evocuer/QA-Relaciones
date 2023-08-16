package Servicio;

import Entidad.Perro;
import Utils.TestAsker;

public class PerroServicio {

    TestAsker leer;

    public PerroServicio (TestAsker Leer) {this.leer = leer;}

    public Perro crearPerro() {

        Perro p = new Perro();
        String nombre = leer.stringAsk("Ingrese el nombre del perro");
        p.setNombre(nombre);
        String raza  = leer.stringAsk("Ingrese la raza del perro");
        p.setRaza(raza);
        Integer edad = leer.intAsk("Ingrese la edad del perro");
        p.setEdad(edad);
        String tamanho = leer.stringAsk("Ingrese el tamaño del perro");
        p.setTamanho(tamanho);

        return p;
    }

}
