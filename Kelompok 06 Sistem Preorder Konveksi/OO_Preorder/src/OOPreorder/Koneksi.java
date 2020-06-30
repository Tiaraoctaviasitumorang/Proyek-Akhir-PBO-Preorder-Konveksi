package OOPreorder;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Koneksi{
 private static Connection koneksi;
 public static Connection getKoneksi(){
  if (koneksi == null){
   try {String url = "jdbc:mysql://localhost:3306/Preorder"; // nama databasenya Preorder
          String user="root"; // username mysql root
          String pass="rifkauli100"; 

 DriverManager.registerDriver(new com.mysql.jdbc.Driver());
koneksi = DriverManager.getConnection(url, user, pass);

 } 
   catch(SQLException t){
     System.out.print("Gagal melakukan koneksi ke database");
 }
}

return koneksi;
}

    ResultSet selectTable(String query) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 } 