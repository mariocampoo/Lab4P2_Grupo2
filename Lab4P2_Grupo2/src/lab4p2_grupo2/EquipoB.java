package lab4p2_grupo2;

import java.util.ArrayList;
import java.util.List;


public class EquipoB extends Equipo{
    private int puntosCanastaAfavor;
    private int puntosEnContra;
    List<Jugadores> jugadoresB;

    public EquipoB() {
        super();
    }

    public EquipoB(int puntosCanastaAfavor, int puntosEnContra, String nombre, String deporte, int puntos, int partidosJugados, int ganados, int perdidos) {
        super(nombre, deporte, puntos, partidosJugados, ganados, perdidos);
        this.puntosCanastaAfavor = 0;
        this.puntosEnContra = 0;
        this.jugadoresB = new ArrayList();
        
        if (this.jugadoresB.size() < getCantidadMin()) {
            System.out.println("El equipo debe tener un minimo de 8 jugadores");
        }else if(this.jugadoresB.size() > getCantidadMax()){
            System.out.println("El equipo debe tener un maximo de 15 jugadores");
        }
        
    }

    public int getPuntosCanastaAfavor() {
        return puntosCanastaAfavor;
    }

    public void setPuntosCanastaAfavor(int puntosCanastaAfavor) {
        this.puntosCanastaAfavor = puntosCanastaAfavor;
    }

    public int getPuntosEnContra() {
        return puntosEnContra;
    }

    public void setPuntosEnContra(int puntosEnContra) {
        this.puntosEnContra = puntosEnContra;
    }

    public List<Jugadores> getCantJugadoresB() {
        return jugadoresB;
    }

    public void setCantJugadoresB(List<Jugadores> cantJugadoresB) {
        this.jugadoresB = cantJugadoresB;
    }
    
    public int getCantidadMax(){
        return 15;
    }
    public int getCantidadMin(){
        return 8;
    }
}
