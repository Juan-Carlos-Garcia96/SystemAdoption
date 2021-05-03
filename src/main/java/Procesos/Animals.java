package Procesos;

public class Animals {

    protected int id;
    protected String name;
    protected String type;
    protected String food;
    protected int quantity;

    public Animals(){}

    Animals(String name,  String type,  int  quantity,   String  food  ){
        this.name = name;
        this.food = food;
        this.quantity = quantity;
        this.type = type;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;

}
    }
