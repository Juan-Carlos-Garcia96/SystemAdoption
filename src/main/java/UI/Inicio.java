package UI;

import java.util.Scanner;

public class Inicio {




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

}
