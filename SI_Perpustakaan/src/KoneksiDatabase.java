
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andi
 */
public class KoneksiDatabase {
    private static Connection konek = null;
    
    public static Connection getConnection(){
        boolean ada_kesalahan = false;
        if (!ada_kesalahan)
        try{
            try{
                Class.forName("com.mysql.jdbc.Driver");
            
            } catch (ClassNotFoundException ex){
            }
                konek = (Connection) DriverManager.getConnection("jdbc:mysql:///Db_perpustakaan","root","");
                System.out.println("koneksi berhasil");
        } catch (SQLException ex){
            System.out.println("koneksi tidak berhasil");
            ada_kesalahan = true;
        }
        return konek;
    }
}
