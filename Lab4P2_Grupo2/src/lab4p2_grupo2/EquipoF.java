package lab4p2_grupo2;

import java.util.ArrayList;
import java.util.List;


public class EquipoF extends Equipo{
    private int ganadosF;
    private int perdidosF;
    private int empatados;
    private int golesAnotados;
    private int golesContra;
    private List<Jugadores> jugadores = new ArrayList();

    public EquipoF() {
        super();
    }

    public EquipoF(int ganados, int perdidos, int empatados, int golesAnotados, int golesContra, String nombre, String deporte, int puntos, int partidosJugados, int ganadosF, int perdidosF) {
        super(nombre, deporte, puntos, partidosJugados, ganados, perdidos);
        this.ganadosF = 0;
        this.perdidosF = 0;
        this.empatados = 0;
        this.golesAnotados = 0;
        this.golesContra = 0;
        
        if (this.jugadores.size() < getCantidadMin()) {
            System.out.println("El equipo debe tener un minimo de 15 jugadores");
        }else if(this.jugadores.size() > getCantidadMax()){
            System.out.println("El equipo debe tener un maximio de 22 jugadores");
        }
    }

    public int getGanadosF() {
        return ganadosF;
    }

    public void setGanadosF(int ganadosF) {
        this.ganadosF = ganadosF;
    }

    public int getPerdidosF() {
        return perdidosF;
    }

    public void setPerdidosF(int perdidosF) {
        this.perdidosF = perdidosF;
    }

    public int getEmpatados() {
        return empatados;
    }

    public void setEmpatados(int empatados) {
        this.empatados = empatados;
    }

    public int getGolesAnotados() {
        return golesAnotados;
    }

    public void setGolesAnotados(int golesAnotados) {
        this.golesAnotados = golesAnotados;
    }

    public int getGolesContra() {
        return golesContra;
    }

    public void setGolesContra(int golesContra) {
        this.golesContra = golesContra;
    }

    public List<Jugadores> getCantJugadores() {
        return jugadores;
    }

    public void setCantJugadores(List<Jugadores> cantJugadores) {
        this.jugadores = cantJugadores;
    }
    
    public int getCantidadMax(){
        return 22;
    }
    
    public int getCantidadMin(){
        return 15;
    }
}
