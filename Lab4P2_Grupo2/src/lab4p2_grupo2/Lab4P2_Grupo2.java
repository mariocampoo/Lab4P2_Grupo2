package lab4p2_grupo2;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4P2_Grupo2 {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Equipo> crearEquipo = new ArrayList();
    static ArrayList<Jugadores> crearJugador = new ArrayList();

    public static void main(String[] args) {
        int opcion1;
        boolean menu = true;
        do {
            System.out.println("    -MENU- ");
            System.out.println("1. Crud Equipo");
            System.out.println("2. Crud Jugadores");
            System.out.println("3. Registrar Partido");
            System.out.println("4. SALIR");
            System.out.print("Elija una opcion: ");
            opcion1 = sc.nextInt();
            switch (opcion1) {
                case 1:
                    boolean crudEquipo = true;

                    do {
                        System.out.println("    -CRUD EQUIPO-");
                        System.out.println("1. Crear Equipo");
                        System.out.println("2. Modificar Equipo");
                        System.out.println("3. Listar Equipo");
                        System.out.println("4. Eliminar Equipo");
                        System.out.println("5. SALIR");
                        System.out.print("Elija una opcion: ");
                        int opcion = sc.nextInt();

                        switch (opcion) {
                            case 1:
                                System.out.print("Ingrese el nombre del equipo: ");
                                String nombre = sc.nextLine();
                                nombre = sc.nextLine();

                                System.out.print("Ingrese el deporte que practica: ");
                                String deporte = sc.nextLine();
                                deporte = sc.nextLine();

                                Equipo nuevoEquipo = null;
                                if (deporte.equalsIgnoreCase("football")) {
                                    nuevoEquipo = new EquipoF();
                                } else if (deporte.equalsIgnoreCase("basketball")) {
                                    nuevoEquipo = new EquipoB();
                                } else if (deporte.equalsIgnoreCase("volleyball")) {
                                    nuevoEquipo = new EquipoV();
                                } else {
                                    System.out.println("Lo siento, pero solo el deporte solo puede ser de football, basketball y volleyball");
                                }

                                if (nuevoEquipo != null) {
                                    nuevoEquipo.setNombre(nombre);
                                    nuevoEquipo.setDeporte(deporte);
                                    crearEquipo.add(nuevoEquipo);
                                    System.out.println("Se ha creado un equipo '" + nombre + "' con el de deporte de " + deporte);
                                }
                                break;
                            case 2:
                                if (crearEquipo.isEmpty()) {
                                    System.out.println("Tiene que crear un equipo primero!!");
                                } else {
                                    System.out.print("Ingrese el nombre del equipo que desea modificar: ");
                                    String nuevoNombre = sc.nextLine();
                                    nuevoNombre = sc.nextLine();

                                    for (Equipo equipo : crearEquipo) {
                                        if (equipo.getNombre().equalsIgnoreCase(nuevoNombre)) {
                                            boolean crudModificar = true;
                                            int eleccionModificar;
                                            do {
                                                System.out.println("Elija el elemenot que desea modificar del " + nuevoNombre);
                                                System.out.println("1. Nombre del equipo");
                                                System.out.println("2. Deporte que practica");
                                                System.out.println("3. La cantidad de puntos");
                                                System.out.println("4. Cantidad de partidos ganados");
                                                System.out.println("5. Cantidad de partidos perdidos");
                                                System.out.println("6. SALIR");
                                                System.out.print("Usted elija: ");
                                                eleccionModificar = sc.nextInt();
                                                switch (eleccionModificar) {
                                                    case 1:
                                                        System.out.print("Ingrese el nuevo nombre: ");
                                                        String nuevoNom = sc.nextLine();
                                                        nuevoNom = sc.nextLine();

                                                        equipo.setNombre(nuevoNom);
                                                        System.out.println("El nuevo nombre es '" + nuevoNom + "' ");

                                                        break;
                                                    case 2:
                                                        System.out.print("Ingrese el nuevo deporte que practica: ");
                                                        String deporteNuevo = sc.nextLine();
                                                        deporteNuevo = sc.nextLine();
                                                        if (!deporteNuevo.equalsIgnoreCase(equipo.getDeporte())) {
                                                            if (deporteNuevo.equalsIgnoreCase("football")) {
                                                                equipo = new EquipoF(equipo.getGanados(), equipo.getPerdidos(), 0, 0, 0, equipo.getNombre(), deporteNuevo, equipo.getPuntos(), equipo.getPartidosJugados(), equipo.getGanados(), equipo.getPerdidos());
                                                                System.out.println("El deporte del equipo '" + nuevoNombre + "' es " + deporteNuevo);
                                                            } else if (deporteNuevo.equalsIgnoreCase("basketball")) {
                                                                equipo = new EquipoB(0, 0, equipo.getNombre(), deporteNuevo, equipo.getPuntos(), equipo.getPartidosJugados(), equipo.getGanados(), equipo.getPerdidos());
                                                                System.out.println("El deporte del equipo '" + nuevoNombre + "' es " + deporteNuevo);
                                                            } else if (deporteNuevo.equalsIgnoreCase("volleyball")) {
                                                                equipo = new EquipoV(0, 0, equipo.getGanados(), equipo.getPerdidos(), equipo.getNombre(), deporteNuevo, equipo.getPuntos(), equipo.getPartidosJugados(), equipo.getGanados(), equipo.getPerdidos());
                                                                System.out.println("El deporte del equipo '" + nuevoNombre + "' es " + deporteNuevo);
                                                            } else {
                                                                System.out.println("El deporte que asigno no se puede asignar solo football, basketball y volleyball");
                                                            }
                                                        } else {
                                                            System.out.println("El nuevo deporte que practica es " + deporteNuevo);
                                                        }
                                                        break;
                                                    case 3:
                                                        System.out.print("Ingrese la cantidad de puntos que va cambiar: ");
                                                        int nuevoPuntos = sc.nextInt();

                                                        equipo.setPuntos(nuevoPuntos);
                                                        System.out.println("Los puntos actualizados del equipo " + nuevoNombre + " son: " + nuevoPuntos);

                                                        break;
                                                    case 4:
                                                        System.out.print("Ingrese la cantidad de partidos Ganados: ");
                                                        int nuevoPartidosG = sc.nextInt();

                                                        equipo.setGanados(nuevoPartidosG);
                                                        System.out.println("Los partidos ganados del equipo " + nuevoNombre + " son " + nuevoPartidosG);
                                                        break;
                                                    case 5:

                                                        System.out.print("Ingrese la cantidad de partidos Perdidos: ");
                                                        int nuevoPartidosP = sc.nextInt();

                                                        equipo.setPerdidos(nuevoPartidosP);
                                                        System.out.println("Los partidos perdidos del equipo " + nuevoNombre + " son " + nuevoPartidosP);

                                                        break;
                                                    case 6:
                                                        crudModificar = false;
                                                        break;

                                                }
                                            } while (!crudModificar);
                                        }
                                    }
                                }

                                break;
                            case 3://Listar Equipo
                                if (crearEquipo.isEmpty()) {
                                    System.out.println("Necesita crear un equipo primero!!!");
                                } else {
                                    System.out.println(crearEquipo);
                                }
                                break;
                            case 4://Eliminar Equipo
                                if (crearEquipo.isEmpty()) {
                                    System.out.println("Primero necesita crear un equipo!!!");
                                } else {
                                    System.out.print("Ingrese el nombre del equipo que desea eliminar: ");
                                    String nombreElim = sc.nextLine();
                                    for (Equipo equipo : crearEquipo) {
                                        if (equipo.getNombre().equalsIgnoreCase(nombreElim)) {
                                            crearEquipo.remove(equipo);
                                            System.out.println("Se ha eliminado " + nombreElim);
                                        }
                                    }
                                }
                                break;
                            case 5:
                                crudEquipo = false;
                                break;
                            default:
                                break;
                        }

                    } while (!crudEquipo);

                    break;
                case 2:
                    boolean crudJugadores = true;
                    do {
                        System.out.println("    -CRUD JUGADORES-");
                        System.out.println("1. Crear Jugador");
                        System.out.println("2. Listar Jugadores");
                        System.out.println("3. Eliminar Jugador");
                        System.out.println("4. Transferencia de Jugador");
                        System.out.println("5. SALIR");
                        System.out.print("Elija una opcion: ");
                        int opcion2 = sc.nextInt();
                        switch (opcion2) {
                            case 1:
                                CrearJugador();
                                break;
                            case 2://Listar Jugadores
                                if (crearJugador.isEmpty()) {
                                    System.out.println("Primero tiene que crear un jugador!!!");
                                } else {
                                    System.out.println(crearJugador);
                                }
                                break;
                            case 3://Eliminar
                                if (crearJugador.isEmpty()) {
                                    System.out.println("Primero tiene que crear un jugador!!!");
                                } else {
                                    System.out.println("Ingrese el nombre del jugador que desea eliminar: ");
                                    String nombreElim = sc.nextLine();
                                    nombreElim = sc.nextLine();
                                    for (Jugadores jugadores : crearJugador) {
                                        if (jugadores.getNombre().equalsIgnoreCase(nombreElim)) {
                                            crearJugador.remove(jugadores);
                                            System.out.println("El jugador '" + nombreElim + "' se ha eliminado");
                                        }
                                    }
                                }
                                break;
                            case 4:
                                boolean transferencia = true;
                                do {
                                    System.out.println("    -MENU Tranferencia Jugadores-");
                                    System.out.println("1. Crear Jugador");
                                    System.out.println("2. Modificar Contrato");
                                    System.out.println("3. Transferir Jugador");
                                    System.out.println("4. SALIR");
                                    System.out.print("Elija una opcion: ");
                                    int opcionT = sc.nextInt();
                                    switch (opcionT) {
                                        case 1://crear jugador
                                            CrearJugador();
                                            break;
                                        case 2://Modificar Contrato
                                            if (crearJugador.isEmpty()) {
                                                System.out.println("Primero tiene que crear un jugador!!!");
                                            } else {
                                                System.out.print("Ingrese el nombre del jugador al que desea modificar su contrato: ");
                                                String nuevoNombre = sc.nextLine();
                                                nuevoNombre = sc.nextLine();

                                                for (Jugadores jugador : crearJugador) {
                                                    if (jugador.getNombre().equalsIgnoreCase(nuevoNombre)) {
                                                        System.out.print("Ingrese al anio a cambiar: ");
                                                        int contratoModificar = sc.nextInt();

                                                        jugador.setContrato(contratoModificar);

                                                    }
                                                }
                                            }
                                            break;
                                        case 3://Transferir Jugador
                                            System.out.print("Ingrese el nombre del jugador: ");
                                            String nombre = sc.nextLine();
                                            nombre = sc.nextLine();

                                            break;
                                        case 4://SALIR
                                            transferencia = false;
                                            break;
                                        default:
                                            System.out.println("La tecla que ha ingresado es invalido");
                                            break;
                                    }
                                } while (!transferencia);

                                break;
                            case 5:
                                crudJugadores = false;
                                break;
                            default:
                                break;
                        }
                    } while (!crudJugadores);

                    break;
                case 3:
                    boolean registrarPartido = true;
                    do {
                        System.out.println("    -Registrar Partido-");
                        System.out.println("1. Buscar Equipos (LISTAR)");
                        System.out.println("2. SALIR");
                        int opcion3 = sc.nextInt();
                        switch (opcion3) {
                            case 1:

                                int op = 0;
                                System.out.println("Ingrese el nombre del equipo que desea buscar");
                                String busq = sc.nextLine();
                                if (crearEquipo.contains(busq)) {
                                    System.out.println("1. Modificar puntos");
                                    System.out.println("2. Partidos ganados");
                                    System.out.println("3. Partidos perdidos");
                                    System.out.println("4. Partidos jugados");
                                    System.out.println("5. Salir");
                                    op = sc.nextInt();
                                    while (op != 5) {
                                        if (op == 1) {
                                            System.out.println("Ingrese los nuevos puntos");
                                            int Npuntos = sc.nextInt();
                                            for (Equipo eq : crearEquipo) {
                                                eq.setPuntos(Npuntos);
                                            }

                                        }
                                    }
                                    if (op == 2) {
                                        System.out.println("Ingrese los partidos ganados");
                                        int partidosG = sc.nextInt();
                                        for (Equipo eq : crearEquipo) {
                                            eq.setGanados(partidosG);
                                        }
                                    }
                                    if (op == 3) {
                                        System.out.println("Ingrese los partidos perdidos");
                                        int partidosP = sc.nextInt();
                                        for (Equipo eq : crearEquipo) {
                                            eq.setPerdidos(partidosP);
                                        }
                                    }
                                    if (op == 4) {
                                        System.out.println("Ingrese los partidos jugados");
                                        int partidosJ = sc.nextInt();
                                        for (Equipo eq : crearEquipo) {
                                            eq.setPartidosJugados(partidosJ);
                                        }
                                    }

                                } else {
                                    System.out.println("Este equipo no existe");
                                }
                                break;
                            case 2:
                                registrarPartido = false;
                                break;
                            default:
                                break;
                        }
                    } while (!registrarPartido);

                    break;
                default:
                    System.out.println("La tecla que ha ingresado es invalida");
                    break;
            }
        } while (!menu);
    }

    public static void CrearJugador() {
        System.out.print("Ingrese el nombre del jugador: ");
        String nombre = sc.nextLine();
        nombre = sc.nextLine();

        System.out.print("Ingrese la edad: ");
        int edad = sc.nextInt();

        System.out.println("Ingrese el sueldo del jugador: ");
        double sueldo = sc.nextDouble();

        System.out.print("Ingrese el nombre del equipo en el que pertenece: ");
        String equipoNombre = sc.nextLine();
        equipoNombre = sc.nextLine();

        Equipo asignarEquipo = null;
        for (Equipo equipo : crearEquipo) {
            if (equipo.getNombre().equalsIgnoreCase(equipoNombre)) {
                asignarEquipo = equipo;
                break;
            }
        }
        if (asignarEquipo != null) {
            System.out.println("Ingrese la cantidad de anios :");
            int contrato = sc.nextInt();

            Jugadores jugador = new Jugadores(nombre, edad, sueldo, equipoNombre, contrato);
            asignarEquipo.getJugadores().add(jugador);
            crearJugador.add(jugador);
        } else {
            System.out.println("Lo siento pero no puede proseguir si no ha ingresado un equipo valido");
        }

    }
}


/*


 */
