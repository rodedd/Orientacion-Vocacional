/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seorientacionvocacional;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;



/**
 *
 * @author Prado
 */
public class ConexionMySQL {
    public String db = "sistema_orientacion";
    public String url = "jdbc:mysql://localhost/"+db;
    public String user = "root";
    public String pass = "2ne1";


   public Connection Conectar(){

       Connection link = null;

       try{

           Class.forName("org.gjt.mm.mysql.Driver");

           link = DriverManager.getConnection(this.url, this.user, this.pass);

       }catch(Exception ex){

           JOptionPane.showMessageDialog(null, ex);

       }

       return link;

   }
}
