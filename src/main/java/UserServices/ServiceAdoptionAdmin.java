package UserServices;

import Conexiones.AdoptionDAO;
import Procesos.Animals;
import Procesos.Dogs;

import java.sql.Connection;
import java.util.Scanner;

public class ServiceAdoptionAdmin {





    public static void registrarAnimal(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre del animal");
        String name = sc.nextLine();
        System.out.println("Ingresa el tipo ");
        String type = sc.nextLine();
        System.out.println("Ingresa su alimento");
        String food = sc.nextLine();
        System.out.println("Ingresa la cantidad");
        int cant = sc.nextInt();

        Animals animals = new Animals();
        animals.setName(name);
        animals.setType(type);
        animals.setFood(food);
        animals.setQuantity(cant);

        AdoptionDAO.registrarAnimal(animals);

    }
    public static void consultaAnimalsGeneral(){

        AdoptionDAO.consultaAnimalsGeneral();

    }
    public static void consultaAnimalsPerro(){

        AdoptionDAO.consultaAnimalsPerros();

    }
    public static  void  consultaAnimalsReptil(){
        AdoptionDAO.consultaAnimalsReptiles();
    }
    public static void actualizarDatosAnimalesType(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el typo correcto al que pertenece este animal: ");
        String typ = sc.nextLine();

        Animals animals = new Animals();
        animals.setType(typ);

    }
    public static void elminiarAnimal(){

    }
}
