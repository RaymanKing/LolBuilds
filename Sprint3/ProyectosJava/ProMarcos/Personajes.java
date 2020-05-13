package clases;

import java.util.ArrayList;

public class Personajes {

    String nombre;
    String posicion;
    ArrayList<Habilidades> habilidades = new ArrayList<Habilidades>();
    ArrayList<Runas> runas = new ArrayList<Runas>();
    ArrayList<Items> items = new ArrayList<Items>();

    public Personajes() {
    }

    public Personajes(String nombre, String posicion, ArrayList<Habilidades> habilidades, ArrayList<Runas> runas,
            ArrayList<Items> items) {

        this.nombre = nombre;
        this.posicion = posicion;
        this.habilidades = habilidades;
        this.runas = runas;
        this.items = items;
    }

    public void addHabilidades(Habilidades habilidades) {
    }

    public void deleteHabilidades(Habilidades habilidades) {
    }
}