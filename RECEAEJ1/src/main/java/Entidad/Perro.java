package Entidad;

public class Perro {

    private String nombre;
    private String raza;
    private Integer edad;
    private String tamanho;

    public Perro() {
    }

    public Perro(String nombre, String raza, Integer edad, String tamanho) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanho = tamanho;
    }

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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                ", tamanho='" + tamanho + '\'' +
                '}';
    }
}
