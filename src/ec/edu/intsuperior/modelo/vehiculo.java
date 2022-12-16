/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author ismael llamatumbi
 */
public class vehiculo {
 //atrivutos
    private String marca;
    private String modelo;
    private String añofarica;
    private String color;
    private String tipo;

    public vehiculo() {
    }
    
 

    public vehiculo(String marca, String modelo, String añofarica, String color, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.añofarica = añofarica;
        this.color = color;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAñofarica() {
        return añofarica;
    }

    public void setAñofarica(String añofarica) {
        this.añofarica = añofarica;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "datos del vehiculo:\n"
    
                
                }

}
