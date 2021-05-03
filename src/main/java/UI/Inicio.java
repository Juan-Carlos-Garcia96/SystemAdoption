package UI;

import UserServices.ServiceAdoptionAdmin;

import java.util.Scanner;

public class Inicio {

     static  int number;


    public static int welcomeUi(){
        Scanner sc = new Scanner(System.in);
        String messageWelcome = "Bienvenido a System Adoption 1.0\n" +
                "----------\n" +
                "Menu\n"+
                "1. Login Administrador\n"+
                "2. Login cliente\n"+
                "-----------";

        System.out.println(messageWelcome);
        int option = sc.nextInt();
        return option;
    }


    /**
     * Validacion de usuario como administrador, temporalmente comparado con un swicth
     * Meta revisar con una base de datos
     *
     * @param pass  el método recibe este parametro para evaluar si es un administrador
     *              o no esta registrado
     * */
    public  static int  veryAdmin(int pass){
        Scanner sc = new Scanner(System.in);
            /**
             * Menu de  administrador para operaciones con animales
             * */

            switch(pass){
                case 12345:
                    System.out.println("Bienvenido administrador \n");
                    System.out.println("Que opcion eliges\n ");
                    System.out.println(" 1. Registrar nuevo animal\n");
                    System.out.println(" 2. Actualizar datos de  animal\n");
                    System.out.println(" 3. Consultar  animales\n");
                    System.out.println(" 4. Eliminar un registro de animal\n");
                    number = sc.nextInt();
                    break;
                default:
                    System.out.println("Incorrecto intenta de nuevo");
                    break;
            }
            return number;

    }


    /**
     * Método que evalua la eleccion y direge  segun la opcion
     * */

    public static void operations(int election){

        switch(election){
            case 1:
                ServiceAdoptionAdmin.registrarAnimal();
                break;
            case 2:
                break;
            case 3:
                Scanner sc = new Scanner(System.in);
                System.out.println("Ingresa el numero segun  el tipo de animal que quiereas consultar ");
                System.out.println("1. Peros \n2. Reptiles\n3. Gatos\n4. Todos");
                int option = sc.nextInt();

                /**
                 * @param option : es un valor que recibe del administrador donde permite hacer una conulta
                 *               con un  query en especifico para cada tipo de animal, como perros, reptiles gatos etc.
                 *
                 * */
                switch (option){
                    case 1:
                        ServiceAdoptionAdmin.consultaAnimalsPerro();
                        break;
                    case 2:
                        ServiceAdoptionAdmin.consultaAnimalsReptil();
                        break;
                    case 3:
                        break;
                    case 4:
                        ServiceAdoptionAdmin.consultaAnimalsGeneral();
                        break;
                }
                break;
            case 4:
                break;
        }
    }

}
