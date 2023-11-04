package lab4p2_grupo2;

import java.util.ArrayList;
import java.util.List;


public class TablaB extends TablaPosiciones{
    private List<Equipo> listaEquipoB = new ArrayList();
    private String tipoEquipo;

    public TablaB(List<Equipo> listaEquipos) {
        super(listaEquipos);
    }

    
    public TablaB(String tipoEquipo, List<Equipo> listaEquipos) {
        super(listaEquipos);
        this.tipoEquipo = tipoEquipo;
    }

    public List<Equipo> getListaEquipoB() {
        return listaEquipoB;
    }

    public void setListaEquipoB(List<Equipo> listaEquipoB) {
        this.listaEquipoB = listaEquipoB;
    }

    public String getTipoEquipo() {
        return tipoEquipo;
    }

    public void setTipoEquipo(String tipoEquipo) {
        this.tipoEquipo = tipoEquipo;
    }
    
    
    public void OrdenarEquipo(){
        for (int i = 0; i < listaEquipoB.size() - 1; i++) {
            for (int j = 0; j < listaEquipoB.size() - i - 1; j++) {
                Equipo equipo1 = listaEquipoB.get(j);
                Equipo equipo2 = listaEquipoB.get(j + 1);
            }
        }
    }
}
