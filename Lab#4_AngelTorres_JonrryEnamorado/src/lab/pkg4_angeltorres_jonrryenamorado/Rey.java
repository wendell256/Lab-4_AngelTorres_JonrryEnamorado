/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4_angeltorres_jonrryenamorado;

import java.awt.Color;

/**
 *
 * @author wende
 */
public class Rey extends Piezas{

    public Rey() {
    }

    public Rey(Color color) {
        super(color);
    }

    @Override
    public void mover(int x, int y, Tablero t, int x2, int y2, Color c) {
        System.out.println("Esta pieza no se puede mover");
    }
    
}
