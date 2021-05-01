package InicioApp;

import static  UI.Inicio.welcomeUi;


public class Comienzo {
    public static void main(String[] args) {


      int electio;

      do {
          electio = welcomeUi();
      }while (electio >= 3);

    }
}
