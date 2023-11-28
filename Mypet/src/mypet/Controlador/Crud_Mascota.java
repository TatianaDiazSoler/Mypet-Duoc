/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypet.Controlador;
import java.text.SimpleDateFormat;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import mypet.Modelo.Mascota;
import mypet.Util.Conexion;

/**
 *
 * @author tatia
 */
public class Crud_Mascota {  
    

   
    public boolean agregar(Mascota masc) {
        Conexion con= new Conexion();                 /*Agregué*/
        Connection conn=con.conectarBD("MyPet");
        PreparedStatement stmt;                                          /*No se poner rutcliente o tipo mascota*/
        String query = "insert into cliente (codigo,nombre,fecha_naci,sexo,vigente) values (?,?,?,?,?)";
        try {1
            stmt = conn.prepareStatement(query);
            stmt.setInt(1,masc.getCodigo());            /*REVISAR*/
            stmt.setString(2,masc.getNombre());
            stmt.setDate(3,java.sql.Date.valueOf(new SimpleDateFormat("yyyy-M-d").format(masc.getFec_nac()));
            stmt.setString(4, masc.getSexo());
            stmt.setBoolean(5, masc.isVigente());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }  
    }  
     


    public DefaultTableModel listarMascota(int opc) { /* AGREGUÉ */
        Statement stmt;
        ResultSet rs;
        Conexion con= new Conexion();
        Connection conn=con.conectarBD("MyPet");
        try {
            stmt = conn.createStatement(); 
            if (opc==-1)
/*                rs = stmt.executeQuery("select m.codigo,m.nombre,m.fec_nac,m.sexo,m.vigente,c.nombre,t.decripcion from mascota m join cliente c on m.rut_cliente = c.rut join tipo_mascota t on m.tipo = t.id");
            else
                rs = stmt.executeQuery("select m.codigo,m.nombre,m.fec_nac,m.sexo,m.vigente,c.nombre,t.decripcion from mascota m join cliente c on m.rut_cliente = c.rut join tipo_mascota t on m.tipo = t.id"+opc);*/              
            DefaultTableModel DT=new DefaultTableModel();
            DT.addColumn("codigo");
            DT.addColumn("Nombre");
            DT.addColumn("Fecha Nacimiento");
            DT.addColumn("Sexo");
            DT.addColumn("Vigente");
            DT.addColumn("Cliente");
            DT.addColumn("Tipo");
            Object[] fila=new Object[7];
            while (rs.next()) { 
                fila[0]=rs.getInt(1);
                fila[1]=rs.getString(2);
                String fecha=new SimpleDateFormat("dd-MM-yyyy").format(rs.getDate(3));
                fila[2]=fecha;
                fila[3]=rs.getString(4)
                if (rs.getBoolean(True))
                    fila[4]="Si";
                else{s
                    fila[4]="No";
                }
                fila[5]=rs.getString(6);f
                fila[6]
                DT.addRow(fila);
            }
            rs.close(); 
            stmt.close(); 
            return(DT);
        } catch (SQLException ex) {
            return null;
        }
    }     
    
    public boolean modificar(Mascota masc) {
        Conexion con= new Conexion();
        Connection conn=con.conectarBD("MyPet");
        PreparedStatement stmt;
        String query = "update mascota set nombre=?,fec_nac=?,sexo=?,vigente=? where codigo=?";
        try {            
            stmt = conn.prepareStatement(query);
            stmt.setString(1,masc.getNombre());
			String fecha=new SimpleDateFormat("dd-MM-yyyy").format(masc.getDate());
            stmt.setString(2, fecha);
            stmt.setString(3, masc.getSexo());
            stmt.setBoolean(4, masc.getVigente());
            stmt.setInt(5,masc.getCodigo());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }     
    }   
        
    
    public boolean eliminar(Mascota masc) {
        Conexion con= new Conexion();
        Connection conn=con.conectarBD("laborando");
        PreparedStatement stmt;
        String query = "delete from mascota where codigo=?";
        try {
            stmt = conn.prepareStatement(query);
            stmt.setString(1,masc.getCodigo());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CrudMascota.class.getName()).log(Level.SEVERE, null, ex);
        }     
        return false;
    }      
    
    
    
   
}
