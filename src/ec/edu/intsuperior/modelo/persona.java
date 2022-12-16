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
public class persona {
    //atrivutos
    private String nombre;
    private String apellido;
    private String edad;
    private String cedula;
    private String genero;
    
    public persona(){    
    }

    public persona(String nombre, String apellido, String edad, String cedula, String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
        this.genero = genero;
    }

    public String getNomre() {
        return nombre;
    }

    public void setNomre(String nomre) {
        this.nombre = nomre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return  "cedula: "
                + "datos de la persona:\n"+getci()"n\"
                + "nombre: "+getci()"n\"

                
                
                
    }
}
