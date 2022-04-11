package Project_5;

public class DarkChocolateMocha extends Coffee{
    DarkChocolateMocha(){ super(); }
    DarkChocolateMocha(String storeName){
        this.setType("Dark Chocolate Mocha");
        this.setPrice(5);
        this.setStoreName(storeName);
    }

    @Override
    public void prepare(){
        System.out.println(this.getType());
       ingredient();
    }

    @Override
    public void ingredient(){
        System.out.println("Ingredients: dark chocolate, caffiene, milk");
        System.out.println("Quantity: " + this.getQuantity()+"\n");
    }

}
