/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONFIG;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author lenovo
 */
public class DB_koneksi {
   static Connection con;
    public static Connection getConnection() {
       
     try {
         con = DriverManager.getConnection("jdbc:mysql://localhost/setiawan_spp","root","");         
     }catch (Exception e) {
         JOptionPane.showMessageDialog(null, "ERROR : Koneksi Gagal!");
         System.exit(0);
     }
       return con;
    } 
}
