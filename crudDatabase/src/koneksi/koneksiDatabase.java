/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;
import java.sql.*;
/**
 *
 * @author alfin
 */
public class koneksiDatabase {
    public static Connection BukaKoneksi(){ //extend ke objek Connection
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db_databarang","root","Tanggallahir@12");
            return cn; //mengembalikan atau menyimpan ke cn
        }catch (Exception e){
            return null; //tidak mengembalikan apapun
        }
    
}
}
