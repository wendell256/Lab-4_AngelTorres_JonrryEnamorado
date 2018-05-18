package lab.pkg4_angeltorres_jonrryenamorado;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab4_AngelTorres_JonrryEnamorado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
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
                    switch (turno) {
                        case 0:
                            t.print();
                            Piezas tmp = new Duende();
                            System.out.println(j1.getNombre() + " Ingrese la posicion x de pieza a mover:");
                            x1 = sc.nextInt();
                            System.out.println(j1.getNombre() + " Ingrese la posicion y de pieza a mover:");
                            y1 = sc.nextInt();
                            boolean verpos1 = true;
                            boolean verpos2 = true;
                            while (verpos1 && verpos2) {
                                if (t.tablero[x1][y1] == "0") {
                                    System.out.println("ERROR NO HAY PIEZAS AHI");
                                    System.out.println(j1.getNombre() + " Ingrese la posicion x de pieza a mover:");
                                    x1 = sc.nextInt();
                                    System.out.println(j1.getNombre() + " Ingrese la posicion y de pieza a mover:");
                                    y1 = sc.nextInt();
                                    verpos1 = true;
                                } else {
                                    verpos1 = false;
                                    tmp = (Piezas) t.tablero[x1][y1];
                                    if (tmp.getColor() == Color.WHITE) {
                                        System.out.println("ERROR ESA PIEZA NO ES TUYA");
                                        System.out.println(j1.getNombre() + " Ingrese la posicion x de pieza a mover:");
                                        x1 = sc.nextInt();
                                        System.out.println(j1.getNombre() + " Ingrese la posicion y de pieza a mover:");
                                        y1 = sc.nextInt();
                                        verpos2 = true;
                                    } else {
                                        verpos2 = false;
                                        verpos1 = true;
                                    }
                                }
                            }
                            System.out.println("Ingrese la nueva posicion x de pieza a mover: ");
                            x2 = sc.nextInt();
                            System.out.println("Ingrese la nueva posicion y de pieza a mover: ");
                            y2 = sc.nextInt();
                            while (t.tablero[x2][y2] != "0") {
                                    System.out.println("ERROR HAY PIEZAS AHI");
                                    System.out.println(j1.getNombre() + " Ingrese la posicion x de pieza a mover:");
                                    x2 = sc.nextInt();
                                    System.out.println(j1.getNombre() + " Ingrese la posicion y de pieza a mover:");
                                    y2 = sc.nextInt();
                                }
                            tmp.mover(x1, y1, t, x2, y2, Color.BLACK);
                            t.print();
                            break;
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

}
