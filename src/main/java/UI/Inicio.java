package UI;

public class Inicio {
    String messageWelcome;



    public static void welcomeUi(){
        String messageWelcome = "Bienvenido a System Adoption 1.0\n" +
                "----------\n" +
                "Menu\n"+
                "1. Login Administrador\n"+
                "2. Login cliente"+
                "-----------";

        System.out.println(messageWelcome);
    }

}
