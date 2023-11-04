package lab4p2_grupo2;

import java.util.ArrayList;
import java.util.List;


public class EquipoV extends Equipo{
    private int puntosAnotados;
    private int puntosRecibidos;
    private int stGanados;
    private int stPerdidos;
    private List<Jugadores> jugadoresV;

    public EquipoV() {
        super();
    }

    public EquipoV(int puntosAnotados, int puntosRecibidos, int stGanados, int stPerdidos, String nombre, String deporte, int puntos, int partidosJugados, int ganados, int perdidos) {
        super(nombre, deporte, puntos, partidosJugados, ganados, perdidos);
        this.puntosAnotados = 0;
        this.puntosRecibidos = 0;
        this.stGanados = 0;
        this.stPerdidos = 0;
        this.jugadoresV = new ArrayList();
        
        if (this.jugadoresV.size() < getCantidadMin()) {
            System.out.println("El equipo debe tener una cantidad minima de 10 jugadores");
        }else if(this.jugadoresV.size() > getCantidadMax()){
            System.out.println("El equipo debe tener una cantidad minima de 18 jugadores");
        }
        
    }
    
    

    public int getPuntosAnotados() {
        return puntosAnotados;
    }

    public void setPuntosAnotados(int puntosAnotados) {
        this.puntosAnotados = puntosAnotados;
    }

    public int getPuntosRecibidos() {
        return puntosRecibidos;
    }

    public void setPuntosRecibidos(int puntosRecibidos) {
        this.puntosRecibidos = puntosRecibidos;
    }

    public int getStGanados() {
        return stGanados;
    }

    public void setStGanados(int stGanados) {
        this.stGanados = stGanados;
    }

    public int getStPerdidos() {
        return stPerdidos;
    }

    public void setStPerdidos(int stPerdidos) {
        this.stPerdidos = stPerdidos;
    }

    public List<Jugadores> getCantJugadoresV() {
        return jugadoresV;
    }

    public void setCantJugadoresV(List<Jugadores> jugadoresV) {
        this.jugadoresV = jugadoresV;
    }
    
    public int getCantidadMax(){
        return 18;
    }
    public int getCantidadMin(){
        return 10;
    }
    
}
