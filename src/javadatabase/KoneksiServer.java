/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadatabase;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author 62813
 */
public class KoneksiServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KoneksiServer tesKoneksi = new KoneksiServer();
        tesKoneksi.koneksi();
        
    }
    
    Connection con = null;
    
    String statusKoneksi;
    public void koneksi()
    {
        try
        {
            String connectionURL = "jdbc:mysql://localhost/mahasiswa";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(connectionURL, username, password);
            //JOptionPane.showMessageDialog(null, "Sukses koneksi");
            statusKoneksi = "Berhasil" ;
        } catch(Exception e){
            //JOptionPane.showMessageDialog(null, e);
            statusKoneksi = "Gagal" ;
            //System.exit(0);
        }
    }
    
}
