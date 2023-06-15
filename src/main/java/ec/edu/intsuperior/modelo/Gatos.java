/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author Mishel
 */
public class Gatos {
    private String raza;
    private String tamaño;
    private String color;

    public String getRaza() {
        return raza;
    }

    public String getTamaño() {
        return tamaño;
    }

    public String getColor() {
        return color;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Gatos(String raza, String tamaño, String color) {
        this.raza = raza;
        this.tamaño = tamaño;
        this.color = color;
    }
}
