package Conexiones;
import java.sql.Connection;
import java.sql.*;

public class Coneccion {

    /**
     * Se crea método para conexion con base de datos
     * con sus valores respectivos
     */

    public Connection get_sConection(){
    Connection conexion = null;

    try{
        conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/systemadoption", "root", "");
    }catch (SQLException ex){
        System.out.println(ex);
    }
        return conexion;

    }
}
