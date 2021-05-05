import UI.Inicio;

import javax.swing.*;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class InicioInteractive {
    public static void main(String[] args) {

        int option_menu = -1;
        String[] botones = {"1.Ingresa como administrador", "2. Ver mascotas "};

        do{
            String option = (String) JOptionPane.showInputDialog(null, "Sistemade adopciones", "Bienvenido a tu mascota", JOptionPane.INFORMATION_MESSAGE, null,
                    botones, botones[0]);

            for (int i = 0; i < botones.length; i++){
                if (option.equals(botones[i])){

                    Scanner sc = new Scanner(System.in);
                    System.out.println("ingresa a contraseña de administrador ");
                    int pass = sc.nextInt();
                    Inicio.veryAdmin(pass);

                }else{
                    System.out.println("Bye");
                }

            }



        }while(option_menu != 1);


    }



}
