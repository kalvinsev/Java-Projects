package Project_5;

public class CoffeeMocha extends Coffee{
    CoffeeMocha(){ super(); }
    private String ingredients;
    CoffeeMocha(String storeName){
        this.setType("Coffee Mocha");
        this.setPrice(5);
        this.setStoreName(storeName);
    }
    
    public String getIngredients(){ return ingredients; }
    public void setIngredients(String ingredients){ this.ingredients = ingredients; }

    @Override
    public void prepare(){
        System.out.println(this.getType());
        ingredient();
    }

    @Override
    public void ingredient(){
        if(this.getType() == "Coffee Mocha"){
            System.out.println("Ingredients: caffiene, milk, 2 espresso shots");
            System.out.println("Quantity: " + this.getQuantity()+"\n");
        }else{
            System.out.println("Ingredients: " + this.getIngredients());
            System.out.println("Quanitity: " + this.getQuantity());
        }
    }
}
