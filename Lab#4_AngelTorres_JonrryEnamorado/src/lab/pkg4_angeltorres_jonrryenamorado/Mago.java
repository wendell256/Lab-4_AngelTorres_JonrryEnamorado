/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4_angeltorres_jonrryenamorado;

import java.awt.Color;
import java.util.Scanner;

public class Mago extends Piezas{
    
    
    

    public Mago(Color color) {
        super(color);
    }

    public Mago() {
    }

    @Override
    public void mover(int x, int y, Tablero t, int x2, int y2, Color c) {
        
        Scanner sc = new Scanner(System.in);
        
        while(!validar(x,y,x2,y2)){
            System.out.println("Posición de pieza no válida");
            System.out.println("Ingrese X: ");
            x2=sc.nextInt();
            System.out.println("Ingrese Y:");
            y2=sc.nextInt();
        }
        
        t.tablero[x2][y2] = t.tablero[x][y];
        t.tablero[x][y] = "0";
        String tmp = t.tvisible[x][y];
        t.tvisible[x2][y2] = tmp;
        t.tvisible[x][y] = "__";
    }
    
    public boolean validar(int x, int y, int x2, int y2){
        if((x==x2) || (y==y2) || (Math.abs(x-x2) == Math.abs(y-y2))){
            return true;
        }
            return false;
    }
    
    public int comer(int x, int y, Tablero t, int x2, int y2, Color c, int p) {
        
    }
    
}
