package lab4p2_grupo2;


public class Jugadores {
    private String nombre;
    private int edad;
    private double sueldo;
    private String equipo;
    private int contrato;

    public Jugadores() {
    }

    public Jugadores(String nombre, int edad, double sueldo, String equipo, int contrato) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
        this.equipo = equipo;
        this.contrato = contrato;
    }

    public String getNombre() {
        return nombre;
    }


    public int getEdad() {
        return edad;
    }


    public double getSueldo() {
        return sueldo;
    }



    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    @Override
    public String toString() {
        return "Jugadores" + "\n"
                + "Nombre = " + nombre + "\n"
                + "Edad = " + edad + "\n"
                + "Sueldo = " + sueldo + "\n"
                + "Equipo = " + equipo + "\n"
                + "Contrato = " + contrato;
    }
    
}
