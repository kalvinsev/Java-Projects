package Project_5;


abstract class Coffee implements HowToMakeDrink{

    private String type;
    private String storeName;
    private int price;
    private int quantity;
    
    
    
    Coffee(){

        type  = "none";
        storeName = "none";
        price = 0;

    }

    Coffee(String type, String storeName, int price, int quantity){

        this.type = type;
        this.storeName = storeName;
        this.price = price;
        this.quantity = quantity;

    }

    public abstract void ingredient();

    public String getType(){ return type; }
    public void setType(String type){ this.type = type; }

    public String getStoreName(){ return storeName; }
    public void setStoreName(String storeName){ this.storeName = storeName; }

    public int getPrice(){ return price*quantity; }
    public void setPrice(int price){ this.price = price; }

    public int getQuantity(){ return quantity; }
    public void setQuantity(int quantity){ this.quantity = quantity; }

    @Override
    public void prepare(){}
    
}
