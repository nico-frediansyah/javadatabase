/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadatabase;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author 62813
 */
public class Update {
    
    KoneksiServer konek = new KoneksiServer();

    public void update(int nim, String nama, String alamat, String jenis) {
        
        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
                //String sql = "insert into santrippts (nim, nama, alamat, jeniskelamin)" + "values('" + nim + "','" + nama + "','" + alamat + "','" + jk + "');";
                String sql_nama = "update santrippts set nama='" + nama + "'where nim='" + nim + "'";
                String sql_alamat = "update santrippts set alamat='" + alamat + "'where nim='" + nim + "'";
                String sql_jenis = "update santrippts set jeniskelamin='" + jenis + "'where nim='" + nim + "'";
                
                statement.executeUpdate(sql_nama);
                statement.executeUpdate(sql_alamat);
                statement.executeUpdate(sql_jenis);
                statement.close();
            

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
}
