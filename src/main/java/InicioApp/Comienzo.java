package InicioApp;

import java.util.Scanner;

import static UI.Inicio.veryAdmin;
import static  UI.Inicio.welcomeUi;


public class Comienzo {
    public static void main(String[] args) {
        int electio;

        do {
            electio = welcomeUi();
        }while (electio >= 3);
        switch (electio){

            case 1:
                Scanner sc = new Scanner(System.in);
                System.out.println("ingresa a contraseña de administrador ");
                int pass = sc.nextInt();
                int option = veryAdmin(pass);
        }


    }
}
/*

              */
