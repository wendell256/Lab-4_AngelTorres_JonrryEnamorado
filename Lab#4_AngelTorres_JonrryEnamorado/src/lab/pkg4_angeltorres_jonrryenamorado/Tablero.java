/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4_angeltorres_jonrryenamorado;

import java.util.ArrayList;

/**
 *
 * @author wende
 */
public class Tablero {
    private String[][] tvisible;
    private String[][] tablero;
    private ArrayList Blancas;
    private ArrayList Negras;

    public Tablero() {
    tablero = new String[10][10];
    tvisible = new String[10][10];
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
    
    public void colocar(){
        tvisible[0][0] = "C";
        
    }
    
    @Override
    public String toString() {
        return "Tablero{" + "tablero=" + tablero + ", Blancas=" + Blancas + ", Negras=" + Negras + '}';
    }
    
    
}
