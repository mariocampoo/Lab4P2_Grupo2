package lab4p2_grupo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TablaF extends TablaPosiciones{
    private List<Equipo> listaEquiposF = new ArrayList();
    private String tipoDeporte;

    public TablaF(List<Equipo> listaEquipos) {
        super(listaEquipos);
    }


    public List<Equipo> getListaEquiposF() {
        return listaEquiposF;
    }

    public void setListaEquiposF(List<Equipo> listaEquiposF) {
        this.listaEquiposF = listaEquiposF;
    }

    public String getTipoDeporte() {
        return tipoDeporte;
    }

    public void setTipoDeporte(String tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }
    
    public void OrdenarEquipo(){
        for (int i = 0; i < listaEquiposF.size() - 1; i++) {
            for (int j = 0; j < listaEquiposF.size() - i - 1; j++) {
                Equipo equipo1 = listaEquiposF.get(j);
                Equipo equipo2 = listaEquiposF.get(j + 1);
            }
        }
    }
    
}