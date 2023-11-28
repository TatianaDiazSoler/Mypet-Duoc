/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypet.Modelo;

import mypet.Modelo.Cliente;
import java.util.Date;

/**
 *
 * @author cetecom
 */
public class Mascota {
    private int codigo;
    private String nombre;
    private Date fec_nac;
    private String sexo;
    private boolean vigente;
    private Cliente cliente_rut;
    private Tipo_mascota tipo_mas;

    public Mascota() {
    }

    public Mascota(int codigo, String nombre, Date fec_nac, String sexo, boolean vigente, Cliente cliente_rut, Tipo_mascota tipo_mas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fec_nac = fec_nac;
        this.sexo = sexo;
        this.vigente = vigente;
        this.cliente_rut = cliente_rut;
        this.tipo_mas = tipo_mas;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFec_nac() {
        return fec_nac;
    }

    public void setFec_nac(Date fec_nac) {
        this.fec_nac = fec_nac;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public boolean isVigente() {
        return vigente;
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }

    public Cliente getCliente_rut() {
        return cliente_rut;
    }

    public void setCliente_rut(Cliente cliente_rut) {
        this.cliente_rut = cliente_rut;
    }

    public Tipo_mascota getTipo_mas() {
        return tipo_mas;
    }

    public void setTipo_mas(Tipo_mascota tipo_mas) {
        this.tipo_mas = tipo_mas;
    }
    
    
}
