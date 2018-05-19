/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4_angeltorres_jonrryenamorado;

import java.awt.Color;
import java.util.Scanner;

/**
 *
 * @author wende
 */
public class Dragon extends Piezas {

    public Dragon() {
    }

    public Dragon(Color color) {
        super(color);
    }
    Scanner sc = new Scanner(System.in);

    @Override
    public void mover(int x, int y, Tablero t, int x2, int y2, Color c) {
        while (!validar(x, y, x2, y2)) {
            System.out.println("Posicion No valida para mover");
            System.out.println("Ingrese x a mover pieza: ");
            x2 = sc.nextInt();
            System.out.println("Ingrese y a mover pieza: ");
            y2 = sc.nextInt();

        }
        t.tablero[x2][y2] = t.tablero[x][y];
        t.tablero[x][y] = "0";
        String tmp = t.tvisible[x][y];
        t.tvisible[x2][y2] = tmp;
        t.tvisible[x][y] = "__";
    }

    public boolean validar(int x, int y, int x2, int y2) {
        if (Math.abs(x - x2) == Math.abs(y - y2)) {
            return true;
        }
        return false;
    }

    @Override
    public int comer(int x, int y, Tablero t, int x2, int y2, Color c, int p) {

        if (!validar(x, y, x2, y2)) {
            return 0;
        } else if (((Dragon) t.tablero[x2][y2]).getColor() != ((Dragon) t.tablero[x][y]).getColor()) {
            return 1;
        } else {
            return 0;
        }
        
    }

}
