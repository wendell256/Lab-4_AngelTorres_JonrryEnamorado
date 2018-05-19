package lab.pkg4_angeltorres_jonrryenamorado;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab4_AngelTorres_JonrryEnamorado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner st = new Scanner(System.in);
        ArrayList<Jugadores> jugador = new ArrayList();
        int menu = -1;
        Jugadores j1 = new Jugadores();
        Jugadores j2 = new Jugadores();
        //try {//Try-Catch menú principal
        do {
            sc = new Scanner(System.in);

            System.out.println("A.M.A \n"
                    + "1 - Administrar Jugadores\n"
                    + "2 - Nueva Partida\n"
                    + "0 - Salir\n");
            menu = sc.nextInt();

            switch (menu) {
                case 1://Agregar, listar, eliminar jugadores
                    int menuJ = -1;

                    // try {
                    do {
                        sc = new Scanner(System.in);
                        System.out.println("Administrar Jugadores\n"
                                + "1 - Agregar\n"
                                + "2 - Listar\n"
                                + "3 - Eliminar\n"
                                + "0 - Regresar\n");
                        menuJ = sc.nextInt();

                        switch (menuJ) {//Menu administrar jugadores

                            case 1://Agregar jugador
                                String nombre,
                                 id,
                                 sex,
                                 birth;

                                boolean f = true;

                                while (f) {
                                    try {
                                        System.out.println("Edad: ");
                                        sc = new Scanner(System.in);
                                        int edad = sc.nextInt();

                                        System.out.println("Nombre: ");
                                        nombre = sc.next();

                                        System.out.println("ID: ");
                                        id = sc.next();

                                        System.out.println("Sexo: ");
                                        sex = sc.next();

                                        System.out.println("Lugar de Nacimiento: ");
                                        birth = sc.next();

                                        jugador.add(new Jugadores(nombre, id, birth, edad, sex));
                                        System.out.println("Jugador agregado exitosamente.");
                                        f = false;

                                    } catch (InputMismatchException e) {
                                        System.out.println("Debe ingresar un entero!");
                                        // e.printStackTrace();
                                        f = true;
                                        sc.reset();
                                    }
                                }

                                break;

                            case 2://Listar jugadores
                                System.out.println("Lista de Jugadores\n");

                                String salida = "";
                                for (Object temp : jugador) {
                                    if (temp instanceof Jugadores) {
                                        salida += temp + "\n";
                                    }
                                }
                                System.out.println(salida);

                                break;
                            case 3://Eliminar Jugadores
                                System.out.println("Eliminar Jugadores\n");
                                int pos;
                                System.out.println("Ingrese la posición: ");
                                pos = sc.nextInt();

                                jugador.remove(pos);
                                break;

                        }//Menu administrar jugadores

                    } while (menuJ != 0);

                    /*} catch (Exception e) {
                            e.printStackTrace();

                        }*/
                    break;

                case 2:
                    boolean v = true;
                    int pos1,
                     pos2;
                    System.out.println("Nueva partida\n");
                    if (jugador.isEmpty()) {
                        System.out.println("ERROR NO HAY JUGADORES");
                    } else {
                        int cont = 0;
                        for (int i = 0; i < jugador.size(); i++) {
                            cont++;
                            Jugadores j = jugador.get(i);
                            System.out.println(cont + ")" + j.getNombre());
                        }

                        while (v) {
                            try {
                                System.out.println("Ingrese Posicion Jugador 1:");
                                sc = new Scanner(System.in);
                                int opc = sc.nextInt();
                                opc--;
                                j1 = jugador.get(opc);
                                v = false;
                            } catch (Exception e1) {
                                System.out.println("Debe ingresar un entero");
                                v = true;
                            }
                        }
                        v = true;
                        while (v) {
                            try {
                                System.out.println("Ingrese Poosicion Jugador 2:");
                                sc = new Scanner(System.in);
                                int opc = sc.nextInt();
                                opc--;
                                j2 = jugador.get(opc);
                                v = false;
                            } catch (Exception e2) {
                                System.out.println("Debe ingresar un entero");
                                v = true;
                            }
                        }
                        Tablero t = new Tablero(j1, j2);
                        t.colocar();
                        sc = new Scanner(System.in);
                        int x1,
                                x2,
                                y1,
                                y2;
                        int turno = 0;
                        char resp = 's';
                        while (resp == 's' || resp == 'S') {
                            switch (turno) {
                                case 0:
                                    t.print();
                                    Piezas tmp = new Duende();
                                    System.out.println("TURNO DE: " + j1.getNombre());
                                    System.out.println(j1.getNombre() + " Ingrese la posicion x de pieza a mover:");
                                    x1 = sc.nextInt();
                                    System.out.println(j1.getNombre() + " Ingrese la posicion y de pieza a mover:");
                                    y1 = sc.nextInt();
                                    int cont2 = 1;
                                    while (cont2 > 0) {
                                        while (ver(x1, y1, t)) {
                                            System.out.println("ERROR NO HAY PIEZAS AHI");
                                            System.out.println(j1.getNombre() + " Ingrese la posicion x de pieza a mover:");
                                            x1 = sc.nextInt();
                                            System.out.println(j1.getNombre() + " Ingrese la posicion y de pieza a mover:");
                                            y1 = sc.nextInt();
                                            cont2++;
                                        }

                                        tmp = (Piezas) t.tablero[x1][y1];
                                        while (vern(tmp)) {
                                            System.out.println("ERROR ESA PIEZA NO ES TUYA");
                                            System.out.println(j1.getNombre() + " Ingrese la posicion x de pieza a mover:");
                                            x1 = sc.nextInt();
                                            System.out.println(j1.getNombre() + " Ingrese la posicion y de pieza a mover:");
                                            y1 = sc.nextInt();
                                            cont2++;
                                        }
                                        cont2--;
                                    }
                                    System.out.println("Ingrese la nueva posicion x de pieza a mover: ");
                                    x2 = sc.nextInt();
                                    System.out.println("Ingrese la nueva posicion y de pieza a mover: ");
                                    y2 = sc.nextInt();
                                    if (t.tablero[x2][y2] != "0") {
                                        Piezas tmp2 = (Piezas) t.tablero[x2][y2];
                                        while ((tmp.getColor() == tmp2.getColor())) {
                                            System.out.println("ERROR HAY PIEZAS AHI");
                                            System.out.println(j1.getNombre() + " Ingrese la posicion x de pieza a mover:");
                                            x2 = sc.nextInt();
                                            System.out.println(j1.getNombre() + " Ingrese la posicion y de pieza a mover:");
                                            y2 = sc.nextInt();
                                            if (t.tablero[x2][y2] != "0"){
                                            tmp2 = (Piezas) t.tablero[x2][y2];
                                            }
                                         }
                                    }
                                    j1.setPuntos(j1.getPuntos() + tmp.comer(x2, y2, t, x2, y2, Color.red, j1.getPuntos()));
                                    tmp.mover(x1, y1, t, x2, y2, Color.BLACK);
                                    turno = 1;
                                    break;
                                case 1:
                                    t.print();
                                    Piezas tmp3 = new Duende();
                                    System.out.println("TURNO DE: " + j2.getNombre());
                                    System.out.println(j2.getNombre() + " Ingrese la posicion x de pieza a mover:");
                                    x1 = sc.nextInt();
                                    System.out.println(j2.getNombre() + " Ingrese la posicion y de pieza a mover:");
                                    y1 = sc.nextInt();
                                    int cont3 = 1;
                                    while (cont3 > 0) {
                                        while (ver(x1, y1, t)) {
                                            System.out.println("ERROR NO HAY PIEZAS AHI");
                                            System.out.println(j1.getNombre() + " Ingrese la posicion x de pieza a mover:");
                                            x1 = sc.nextInt();
                                            System.out.println(j1.getNombre() + " Ingrese la posicion y de pieza a mover:");
                                            y1 = sc.nextInt();
                                            cont3++;
                                        }
                                        
                                        tmp3 = (Piezas) t.tablero[x1][y1];
                                        while (verb(tmp3)) {
                                            System.out.println("ERROR ESA PIEZA NO ES TUYA");
                                            System.out.println(j1.getNombre() + " Ingrese la posicion x de pieza a mover:");
                                            x1 = sc.nextInt();
                                            System.out.println(j1.getNombre() + " Ingrese la posicion y de pieza a mover:");
                                            y1 = sc.nextInt();
                                            cont3++;
                                        }
                                        cont3--;
                                    }
                                    System.out.println("Ingrese la nueva posicion x de pieza a mover: ");
                                    x2 = sc.nextInt();
                                    System.out.println("Ingrese la nueva posicion y de pieza a mover: ");
                                    y2 = sc.nextInt();
                                    if (t.tablero[x2][y2] != "0") {
                                        Piezas tmp2 = (Piezas) t.tablero[x2][y2];
                                        while ((tmp3.getColor() == tmp2.getColor())) {
                                            System.out.println("ERROR HAY PIEZAS AHI");
                                            System.out.println(j1.getNombre() + " Ingrese la posicion x de pieza a mover:");
                                            x2 = sc.nextInt();
                                            System.out.println(j1.getNombre() + " Ingrese la posicion y de pieza a mover:");
                                            y2 = sc.nextInt();
                                            tmp2 = (Piezas) t.tablero[x2][y2];
                                        }
                                    }
                                    j2.setPuntos(j2.getPuntos() + tmp3.comer(x2, y2, t, x2, y2, Color.WHITE, j2.getPuntos()));
                                    tmp3.mover(x1, y1, t, x2, y2, Color.WHITE);
                                    turno = 0;
                                    break;
                            }
                            System.out.println("PUNTAJE");
                            System.out.println(j1.getNombre() + ": " + j1.getPuntos());
                            System.out.println(j2.getNombre() + ": " + j2.getPuntos());
                            System.out.println("Desea Continuar?s/n");

                            resp = st.next().charAt(0);
                        }
                    }
                    break;

                case 3:

                    break;

            }
        } while (menu != 0);

        /*} catch (Exception e) {
            e.printStackTrace();

        }//Final Try-Catch menú principal*/
    }

    public static boolean ver(int x1, int y1, Tablero t) {
        if (t.tablero[x1][y1] == "0") {
            return true;
        }
        return false;
    }

    public static boolean vern(Piezas tmp) {
        if (tmp.getColor() == Color.WHITE) {
            return true;
        }
        return false;
    }
    public static boolean verb(Piezas tmp) {
        if (tmp.getColor() == Color.BLACK) {
            return true;
        }
        return false;
    }
}
