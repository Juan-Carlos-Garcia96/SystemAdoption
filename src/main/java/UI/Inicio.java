package UI;

import UserServices.ServiceAdoptionAdmin;

import java.util.Scanner;

public class Inicio {

    static int number;


    public static int welcomeUi() {
        Scanner sc = new Scanner(System.in);
        String messageWelcome = "Bienvenido a System Adoption 1.0\n" +
                "----------\n" +
                "Menu\n" +
                "1. Login Administrador\n" +
                "2. Login cliente\n" +
                "-----------";

        System.out.println(messageWelcome);
        int option = sc.nextInt();
        return option;
    }


    /**
     * Validacion de usuario como administrador, temporalmente comparado con un swicth
     * Meta revisar con una base de datos
     *
     * @param pass el método recibe este parametro para evaluar si es un administrador
     *             o no esta registrado
     */
    public static int veryAdmin(int pass) {
        Scanner sc = new Scanner(System.in);
        /**
         * Menu de  administrador para operaciones con animales
         * */

        switch (pass) {
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
     * Método que realiza consulta de animales:
     */

    public static void consultasAnimales() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el numero segun  el tipo de animal que quiereas consultar ");
        System.out.println("1. Peros \n2. Reptiles\n3. Gatos\n4. Todos");
        int election = sc.nextInt();
        switch (election) {
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
    }


    /**
     * Método que evalua la eleccion y direge  segun la opcion
     */

    public static void operations(int election) {

        switch (election) {
            case 1:
                ServiceAdoptionAdmin.registrarAnimal();
                break;
            case 2:
                Scanner sc = new Scanner(System.in);
                System.out.println("Ingresa que dato deseas modificar ");
                System.out.println("1. Nombre\n2. Tipo\n3. Cantidad\n4. Alimento");
                int option = sc.nextInt();
                switch (option){
                    case 1:
                        ServiceAdoptionAdmin.actualizarDatosAnimalsName();
                        break;
                    case 2:
                        ServiceAdoptionAdmin.actualizarDatosAnimalesType();
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    default:
                        break;
                }

                break;
            case 3:
                consultasAnimales();

                break;
            case 4:
                break;
        }
    }

    public static void operationClient() {

        String menu = "Bienvenido amaras adoptar!!!\n"
                + "¿Que deseas hacer?\n"
                + " 1. Aportar \n "
                + " 2. Ver animales disponibles \n"
                + " --------------- ";

        Scanner sc = new Scanner(System.in);
        System.out.println(menu);
        int option = sc.nextInt();

        switch (option) {
            case 1:

                System.out.println("Losiento estamols trabajando para arreglar esto");
                break;
            case 2:
               consultasAnimales();
               break;

               default:
                   break;
                }

        }


    }
