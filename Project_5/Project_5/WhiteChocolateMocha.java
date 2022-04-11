package Project_5;

import java.util.ArrayList;

public class WhiteChocolateMocha extends Coffee {

    WhiteChocolateMocha(){ super(); }
    WhiteChocolateMocha(String storeName){
        this.setType("White Chocolate Mocha");
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
        System.out.println("Ingredients: white chocolate, caffiene, milk");
        System.out.println("Quantity: " + this.getQuantity()+"\n");
    }

}