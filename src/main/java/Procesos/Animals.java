package Procesos;

public class Animals {

    private int id;
    private String name;
    private String type;
    private String food;
    private int quantity;

    Animals(){}

    Animals(String name,  String type,  int  quantity,   String  food  ){
        this.name = name;
        this.food = food;
        this.quantity = quantity;
        this.type = type;
    }

}
