package Procesos;

public class Dogs extends Animals {

     public Dogs(String name, String type, int quantity, String food){
        super(name, type, quantity, food);
    }

    public void datesDogs(){
        System.out.println("El nombre es: " + this.name + " Su especie es : "+ this.type+ " Cantidad " + this.quantity +
                " Se alimentan " + this.food);
    }

}
