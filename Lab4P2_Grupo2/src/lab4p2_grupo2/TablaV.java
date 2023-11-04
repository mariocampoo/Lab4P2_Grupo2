package lab4p2_grupo2;

import java.util.ArrayList;
import java.util.List;


public class TablaV extends TablaPosiciones{
    private List<Equipo> listaEquiposV = new ArrayList();
    private String tipoEquipo;
    
    
    public TablaV(List<Equipo> listaEquipos) {
        super(listaEquipos);
    }
    
    
    
    public List<Equipo> getListaEquiposV() {
        return listaEquiposV;
    }

    public void setListaEquiposV(List<Equipo> listaEquiposV) {
        this.listaEquiposV = listaEquiposV;
    }

    public String getTipoEquipo() {
        return tipoEquipo;
    }

    public void setTipoEquipo(String tipoEquipo) {
        this.tipoEquipo = tipoEquipo;
    }
    
    public void OrdenarEquipo(){
        for (int i = 0; i < listaEquiposV.size() - 1; i++) {
            for (int j = 0; j < listaEquiposV.size() - i - 1; j++) {
                Equipo equipo1 = listaEquiposV.get(j);
                Equipo equipo2 = listaEquiposV.get(j + 1);
            }
        }        
    }
}
