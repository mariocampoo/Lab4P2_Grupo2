package lab4p2_grupo2;

import java.util.ArrayList;
import java.util.List;


public abstract class TablaPosiciones {
    private List<Equipo> listaEquipos= new ArrayList();

    public TablaPosiciones(List<Equipo> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }
    
    
    
    
    public abstract void OrdenarEquipo();

    @Override
    public String toString() {
        return "TablaPosiciones" + "\n"
                + "Lista de Equipos = " + listaEquipos;
    }
        
    
    
}
