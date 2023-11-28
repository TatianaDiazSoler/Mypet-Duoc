/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypet.Controlador;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import mypet.Modelo.Cliente;
import mypet.Util.Conexion;

/**
 *
 * @author cetecom
 */
public class Crud_Clientes {
    
    public boolean agregar(Cliente cli) {
        Conexion con= new Conexion();
        Connection conn=con.conectarBD("MyPet");
        PreparedStatement stmt;
        String query = "insert into cliente (rut,dv,nombre,apepat,apemat) values (?,?,?,?,?)";
        try {
            stmt = conn.prepareStatement(query);
            stmt.setString(1,cli.getRut());
            stmt.setString(2,cli.getDv());
            stmt.setString(3,cli.getNombre());
            stmt.setString(4, cli.getApepat());
            stmt.setString(5, cli.getApemat());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }         
    }

    public DefaultTableModel listarClientes(int opc) {   /* AGREGUÉ */
        Statement stmt;
        ResultSet rs;
        Conexion con= new Conexion();
        Connection conn=con.conectarBD("MyPet");
        try {
            stmt = conn.createStatement(); 
            if (opc==-1){
                rs = stmt.executeQuery("select * from cliente");
            }else{
                rs = stmt.executeQuery("select * from cliente where rut = "+opc);
            }
            DefaultTableModel DT=new DefaultTableModel();
            DT.addColumn("Rut");
            DT.addColumn("Nombre");
            DT.addColumn("Apellido paterno");
            DT.addColumn("Apellido Materno");
            Object[] fila=new Object[5];
            while (rs.next()) { 
                fila[0]=rs.getString(1);
                fila[1]=rs.getString(2);
                fila[2]=rs.getString(3);
                fila[3]=rs.getString(4);
                fila[4]=rs.getString(5);
                DT.addRow(fila);
            }
            rs.close(); 
            stmt.close(); 
            return(DT);
        } catch (SQLException ex) {
            return null;
        }
    }    

    public boolean modificar(Cliente cli) {
        Conexion con= new Conexion();
        Connection conn=con.conectarBD("MyPet");
        PreparedStatement stmt;
        String query = "update cliente set dv=?,nombre=?,apemat=?,apepat=? where rut=?";
        try {            
            stmt = conn.prepareStatement(query);
            stmt.setString(1,cli.getNombre());
            stmt.setString(2, cli.getApepat());
            stmt.setString(3, cli.getApepat());
            stmt.setString(4, cli.getRut());
            stmt.setString(5,cli.getDv());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }     
    }   
    
    public String buscar(Cliente cli) {
        Statement stmt;
        ResultSet rs;
        Conexion con= new Conexion();
        Connection conn=con.conectarBD("MyPet");
        String codigo="-1";
        try {
            stmt = conn.createStatement(); 
            rs = stmt.executeQuery("select rut,dv,nombre,apepat,apemat from cliente where rut='"+cli.getRut()+"'");
            while (rs.next()) { 
                cli.setNombre(rs.getString(3));
                cli.setApepat(rs.getString(4));
                cli.setApemat(rs.getString(5));
				cli.setRut(rs.getString(1));
                codigo=cli.getRut(); 
            }
            rs.close(); 
            stmt.close(); 
            return codigo;
        } catch (SQLException ex) {
           return codigo; 
        }
    }    

    public boolean eliminar(Cliente cli) {
        Conexion con= new Conexion();
        Connection conn=con.conectarBD("Mypet");
        PreparedStatement stmt;
        String query = "delete from cliente where rut=?";
        try {
            stmt = conn.prepareStatement(query);
            stmt.setString(1,cli.getRut());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            
        }     
        return false;
    }     



    

}
    