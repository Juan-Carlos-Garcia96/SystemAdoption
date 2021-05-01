package Conexiones;

import java.sql.*;

public class Coneccion {

    public Connection get_Conection(){
    Connection conexion = null;

    try{
        conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/systemadoption", "root", "");
    }catch (SQLException ex){
        System.out.println(ex);
    }
        return conexion;

    }
}
