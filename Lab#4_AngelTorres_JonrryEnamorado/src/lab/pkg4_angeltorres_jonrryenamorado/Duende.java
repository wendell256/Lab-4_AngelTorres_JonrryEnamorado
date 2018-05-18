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
public class Duende extends Piezas {

    public Duende() {
    }

    public Duende(Color color) {
        super(color);
    }
    
    
    Scanner sc = new Scanner(System.in);
    @Override
    public void mover (int x, int y, Tablero t, int x2, int y2, Color c){
        
        if(c == Color.BLACK){
            while(!validarn(x,y,x2,y2)){
                System.out.println("Posicion No valida para mover");
            System.out.println("Ingrese x a mover pieza: ");
            x2 = sc.nextInt();
            System.out.println("Ingrese y a mover pieza: ");
            y2 = sc.nextInt();
            }
        }
        else{
            while(!validarb(x,y,x2,y2)){
                System.out.println("Posicion No valida para mover");
            System.out.println("Ingrese x a mover pieza: ");
            x2 = sc.nextInt();
            System.out.println("Ingrese y a mover pieza: ");
            y2 = sc.nextInt();
            }
        }
        
    }
public boolean validarn(int x, int y, int x2, int y2){
    if(x2-x == 1 && y == y2){
        return true;
    }
    return false;
}
public boolean validarb(int x, int y, int x2, int y2){
    if(x2-x == -1 && y == y2){
        return true;
    }
    return false;
}

    @Override
    public int comer(int x, int y, Tablero t, int x2, int y2, Color c, int p) {
        
    }
    
}
