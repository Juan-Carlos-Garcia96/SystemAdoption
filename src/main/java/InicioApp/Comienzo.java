package InicioApp;

import java.util.Scanner;

import static UI.Inicio.*;


public class Comienzo {
    public static void main(String[] args) {
        int electio;

        /**
         * Menu principal
         * */
        do {
            electio = welcomeUi();
        }while (electio >= 3);

        /**
         * Validacion de administrador
         * */
        switch (electio){

            case 1:
                Scanner sc = new Scanner(System.in);
                System.out.println("ingresa a contraseña de administrador ");
                int pass = sc.nextInt();
                int option = veryAdmin(pass);
                operations(option);

        }


    }
}
/*

              */
