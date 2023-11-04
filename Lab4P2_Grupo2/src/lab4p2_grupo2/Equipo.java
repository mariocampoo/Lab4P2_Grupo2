package lab4p2_grupo2;

import java.util.ArrayList;


public class Equipo {
    private String nombre;
    private String deporte;
    private int puntos;
    private int partidosJugados;
    private int ganados;
    private int perdidos;
    private ArrayList<Jugadores> jugadores;

    public Equipo() {
        super();
    }    
    
    public Equipo(String nombre, String deporte, int puntos, int partidosJugados, int ganados, int perdidos) {
        this.nombre = nombre;
        this.deporte = deporte;
        this.puntos = puntos;
        this.partidosJugados = partidosJugados;
        this.ganados = ganados;
        this.perdidos = perdidos;
        this.jugadores = new ArrayList();
    }

    public ArrayList<Jugadores> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugadores> jugadores) {
        this.jugadores = jugadores;
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getGanados() {
        return ganados;
    }

    public void setGanados(int ganados) {
        this.ganados = ganados;
    }

    public int getPerdidos() {
        return perdidos;
    }

    public void setPerdidos(int perdidos) {
        this.perdidos = perdidos;
    }

    @Override
    public String toString() {
        return "Equipo\n"
                + "" +"Nombre = " + nombre + "\n"
                + "Deporte = " + deporte + "\n"
                + "Puntos = " + puntos + "\n"
                + "Partidos Jugados = " + partidosJugados + "\n"
                + "Ganados = " + ganados + "\n"
                + "Perdidos = " + perdidos;
    }
    
    
}

