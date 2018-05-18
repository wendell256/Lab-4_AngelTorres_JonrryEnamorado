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
public abstract class Piezas {
    protected Color color;
    protected String material;

    public Piezas() {
    }

    public Piezas(Color color) {
        this.color = color;
    }

    
    public Piezas(Color color, String material) {
        this.color = color;
        this.material = material;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Piezas{" + "color=" + color + ", material=" + material + '}';
    }
    public abstract void mover(int x, int y, Tablero t, int x2, int y2, Color c);
    public abstract int comer(int x, int y, Tablero t, int x2, int y2, Color c, int p);
    
}
