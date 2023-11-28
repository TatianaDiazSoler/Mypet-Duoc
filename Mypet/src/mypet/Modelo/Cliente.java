/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypet.Modelo;

/**
 *
 * @author Tatiana Diaz y Anibal Montecinos
 */
public class Cliente {
    private String rut;
    private String dv;
    private String Nombre;
    private String Apepat;
    private String Apemat;

    public Cliente() {
    }

    public Cliente(String rut, String dv, String Nombre, String Apepat, String Apemat) {
        this.rut = rut;
        this.dv = dv;
        this.Nombre = Nombre;
        this.Apepat = Apepat;
        this.Apemat = Apemat;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApepat() {
        return Apepat;
    }

    public void setApepat(String Apepat) {
        this.Apepat = Apepat;
    }

    public String getApemat() {
        return Apemat;
    }

    public void setApemat(String Apemat) {
        this.Apemat = Apemat;
    }
    
    
}
