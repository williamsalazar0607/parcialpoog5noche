package arreglosjava;
import javax.swing.*;
import java.util.ArrayList;

class Atleta {
    private String nombre;
    private String nacionalidad;
    private double tiempo;

    public Atleta(String nombre, String nacionalidad, double tiempo) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public double getTiempo() {
        return tiempo;
    }
}