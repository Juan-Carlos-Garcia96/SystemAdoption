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
    public static void consultaAnimalsGeneral(){
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

    public static void consultaAnimalsPerros(){
        Coneccion conexion_db = new Coneccion();

        PreparedStatement ps = null;
        ResultSet rs = null;
        try(Connection cone = conexion_db.get_sConection()){

            try{
                String queryConsult = "SELECT * FROM systemadoption.animals WHERE type LIKE 'perro'";
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

    public static void  consultaAnimalsReptiles(){
        Coneccion conec = new Coneccion();

        PreparedStatement ps = null;
        ResultSet rs = null;
        try( Connection conexion =  conec.get_sConection()){

            try{
                String queryReptil = " SELECT * FROM systemadoption.animals WHERE type LIKE 'reptil'";
                ps = conexion.prepareStatement(queryReptil);
                rs = ps.executeQuery();

                while(rs.next()){

                    System.out.println(" El id es "+ rs.getInt("id"));
                    System.out.println("El nombre es "+ rs.getString("name"));
                    System.out.println("Es un : " + rs.getString("type"));
                    System.out.println("Se alimentan de : " + rs.getString("food"));
                    System.out.println("Tenemos una existencia de " + rs.getInt("quantity"));
                    System.out.println("-------------------");
                }
            }catch (Exception e){
                System.out.println(e);
            }

        }catch (SQLException ex){
            System.out.println(ex);
        }
    }
    public static void actualizarDatosAnimalesTypes(Animals animals){
    Coneccion conection_db = new Coneccion();

    PreparedStatement ps = null;

    try(Connection conexion = conection_db.get_sConection()){
        try{

            String queryUpdate = "UPDATE systemadoption.animals SET type = ? WHERE id = ?";
            ps = conexion.prepareStatement(queryUpdate);
            ps.setString(1,animals.getType());
            ps.setInt(2,animals.getId());
            ps.executeUpdate();
            System.out.println("Actualizacion correcta, se actualizo: " + animals.getType() );


        }catch (Exception e){
            System.out.println(e);
        }


    }catch (SQLException ex){
        System.out.println(ex);
    }


    }
    public static void actualizaDatosAnimalesName(Animals animals) {
        Coneccion db_conection = new Coneccion();

        PreparedStatement ps = null;

        try (Connection conexion = db_conection.get_sConection()) {

            try {
                String queryUpdateName = "UPDATE systemadoption.animals SET name = ? WHERE id = ?";
                ps = conexion.prepareStatement(queryUpdateName);
                ps.setString(1, animals.getName());
                ps.setInt(2, animals.getId());
                ps.executeUpdate();
                System.out.println("acabas de actualizar: " + animals.getName());

            } catch (Exception ex) {
                System.out.println(ex);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public static void elminiarAnimal(){

    }

}
