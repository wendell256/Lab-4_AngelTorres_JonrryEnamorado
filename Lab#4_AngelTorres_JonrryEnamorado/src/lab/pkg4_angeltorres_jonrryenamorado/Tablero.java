/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4_angeltorres_jonrryenamorado;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author wende
 */
public class Tablero {

    public String[][] tvisible;
    public Object[][] tablero;
    private ArrayList Blancas;
    private ArrayList Negras;

    public Tablero(Jugadores j1, Jugadores j2) {
        tablero = new Object[10][10];
        tvisible = new String[10][10];
        Blancas = new ArrayList();
        Negras = new ArrayList();
        Blancas.add(j1);
        Negras.add(j2);
        //agregar piezas
        Blancas.add(new Caballeros());
        Blancas.add(new Caballeros());
        Blancas.add(new Caballeros());
        //
        Blancas.add(new Duende());
        Blancas.add(new Duende());
        Blancas.add(new Duende());
        Blancas.add(new Duende());
        //
        Blancas.add(new Arquero());
        Blancas.add(new Arquero());
        Blancas.add(new Arquero());
        Blancas.add(new Arquero());
        //
        Blancas.add(new Mago());
        //
        Blancas.add(new Dragon());
        Blancas.add(new Dragon());
        //
        Blancas.add(new Rey());
        //
        Negras.add(new Caballeros());
        Negras.add(new Caballeros());
        Negras.add(new Caballeros());
        //
        Negras.add(new Duende());
        Negras.add(new Duende());
        Negras.add(new Duende());
        Negras.add(new Duende());
        //
        Negras.add(new Arquero());
        Negras.add(new Arquero());
        Negras.add(new Arquero());
        Negras.add(new Arquero());
        //
        Negras.add(new Mago());
        //
        Negras.add(new Dragon());
        Negras.add(new Dragon());
        //
        Negras.add(new Rey());
    }

    public void colocar() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablero[i][j] = "X";
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tvisible[i][j] = "__";
            }
        }
        tvisible[0][0] = "CN";
        tvisible[0][2] = "FN";
        tvisible[0][3] = "AN";
        tvisible[0][4] = "RN";
        tvisible[0][5] = "MN";
        tvisible[0][6] = "AN";
        tvisible[0][7] = "FN";
        tvisible[0][9] = "CN";
        tvisible[1][0] = "DN";
        tvisible[1][2] = "AN";
        tvisible[1][3] = "DN";
        tvisible[1][4] = "CN";
        tvisible[1][5] = "FN";
        tvisible[1][6] = "DN";
        tvisible[1][7] = "AN";
        tvisible[1][9] = "DN";
        //
        tvisible[8][0] = "DB";
        tvisible[8][2] = "AB";
        tvisible[8][3] = "DB";
        tvisible[8][4] = "FB";
        tvisible[8][5] = "CB";
        tvisible[8][6] = "DB";
        tvisible[8][7] = "AB";
        tvisible[8][9] = "DB";
        tvisible[9][0] = "CB";
        tvisible[9][2] = "FB";
        tvisible[9][3] = "AB";
        tvisible[9][4] = "MB";
        tvisible[9][5] = "RB";
        tvisible[9][6] = "AB";
        tvisible[9][7] = "FB";
        tvisible[9][9] = "CB";
        //llenar tablero con piezas
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                switch (tvisible[i][j]) {
                    case "CN":
                        tablero[i][j] = new Caballeros(Color.BLACK);
                        break;
                    case "FN":
                        tablero[i][j] = new Dragon(Color.BLACK);
                        break;
                    case "AN":
                        tablero[i][j] = new Arquero(Color.BLACK);
                        break;
                    case "RN":
                        tablero[i][j] = new Rey(Color.BLACK);
                        break;
                    case "MN":
                        tablero[i][j] = new Mago(Color.BLACK);
                        break;
                    case "DN":
                        tablero[i][j] = new Duende(Color.BLACK);
                        break;
                    case "CB":
                        tablero[i][j] = new Caballeros(Color.WHITE);
                        break;
                    case "FB":
                        tablero[i][j] = new Dragon(Color.WHITE);
                        break;
                    case "AB":
                        tablero[i][j] = new Arquero(Color.WHITE);
                        break;
                    case "RB":
                        tablero[i][j] = new Rey(Color.WHITE);
                        break;
                    case "MB":
                        tablero[i][j] = new Mago(Color.WHITE);
                        break;
                    case "DB":
                        tablero[i][j] = new Duende(Color.WHITE);
                        break;
                    default:
                        tablero[i][j] = "0";
                        
                }
            }
        }

    }

    public void print() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (tvisible[i][j].length() > 1) {
                    System.out.print(tvisible[i][j] + " ");
                } else {
                    System.out.print(tvisible[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }

    @Override
    public String toString() {
        return "Tablero{" + "tablero=" + tablero + ", Blancas=" + Blancas + ", Negras=" + Negras + '}';
    }

}
