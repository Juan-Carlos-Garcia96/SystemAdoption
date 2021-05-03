package Conexiones;

import Procesos.Animals;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdoptionDAO {



    public static void registrarAnimal(Animals animals){
        Coneccion coneccion_db = new Coneccion();

        /**
         * Se crea proceso de conexion con la base de datos
         * donde esta el proceso de enviar los dattos ingresados por el usuario
         * a la base de daatos, estos son obtenidos de la clase "ServiceAdoptionAdmin"
         * */
        try(Connection conexion = coneccion_db.get_sConection()){
            PreparedStatement ps = null;
            try {
                String quaeryInsert =  "INSERT INTO animals (`name`, `type`, `food`, `quantity`) VALUES (?, ?, ? , ?)";
                ps = conexion.prepareStatement(quaeryInsert);
                ps.setString(1, animals.getName());
                ps.setString(2, animals.getType());
                ps.setString(3,animals.getFood());
                ps.setInt(4,animals.getQuantity());
                ps.executeUpdate();
                System.out.println( animals.getName() +  " Bienvenido a la familia :)");
            }catch (Exception e){
                System.out.println(e);
            }


        }catch (SQLException ex){
            System.out.println(ex);

        }

    }
    public static void consultaAnimals(){
        Coneccion conexion_db = new Coneccion();

        PreparedStatement ps = null;
        ResultSet rs = null;
        try(Connection cone = conexion_db.get_sConection()){

       try{
           String queryConsult = "SELECT * FROM systemadoption.animals";
           ps = cone.prepareStatement(queryConsult);
           rs = ps.executeQuery();

           while(rs.next()){
               System.out.println(" El id es : " + rs.getInt("id"));
               System.out.println("El nombre es "+ rs.getString("name"));
               System.out.println("Es un : " + rs.getString("type"));
               System.out.println("Se alimentan de : " + rs.getString("food"));
               System.out.println("Tenemos una existencia de " + rs.getInt("quantity"));
               System.out.println("-------------------");

           }

       }catch(Exception e){
           System.out.println(e);
       }
        }catch (SQLException ex){
            System.out.println(ex);
        }

    }
    public static void actualizarDatosAnimales(){

    }
    public static void elminiarAnimal(){

    }

}
