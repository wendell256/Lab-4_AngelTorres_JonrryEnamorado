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
public class Caballeros extends Piezas{

    public Caballeros() {
    
    }

    public Caballeros(Color color, String material) {
        super(color, material);
    }

    public Caballeros(Color color) {
        super(color);
    }
    Scanner sc = new Scanner (System.in);
    @Override
    public void mover(int x, int y, Tablero t, int x2, int y2, Color c) {
        while(!validar(x,y,x2,y2)){
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
    public boolean validar(int x, int y, int x2, int y2){
        if(((x==x2) && (Math.abs(x2-x) == 1) || ((y==y2)&& (Math.abs(y2-y) == 1)))){
            return true;
        }
            return false;
    }
}
