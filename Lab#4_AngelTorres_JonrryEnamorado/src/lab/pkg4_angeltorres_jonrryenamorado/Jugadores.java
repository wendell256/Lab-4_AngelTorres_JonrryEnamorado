/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4_angeltorres_jonrryenamorado;

import java.util.Date;

/**
 *
 * @author wende
 */
public class Jugadores {
    private String nombre;
    private String id;
    private int puntos;
    private String birth;
    private int edad;
    private String sex;

    public Jugadores() {
    }

    public Jugadores(String nombre, String id, String birth, int edad, String sex) {
        this.nombre = nombre;
        this.id = id;
        puntos = 0;
        this.birth = birth;
        this.edad = edad;
        this.sex = sex;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "nombre=" + nombre + ", id=" + id + ", puntos=" + puntos + ", birth=" + birth + ", edad=" + edad + ", sex=" + sex + '}';
    }
    
    
}
