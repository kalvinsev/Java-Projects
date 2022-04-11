package Project_4;
import java.util.*;
import java.util.ArrayList;

public class ShoppingCart {
    Scanner input = new Scanner(System.in);
    private String customerName;
    private String currentDate;
    private ArrayList<ItemToPurchase> cartItems = new ArrayList<ItemToPurchase>();

    ShoppingCart(){
        customerName = "none";
        currentDate = "January 1, 2016";
    }

    ShoppingCart(String name, String date){
        customerName = name;
        currentDate = date;
    }

    public String getCustomerName(){ return customerName; }
    public void setCustomerName(String name){ customerName = name; }
    public String getDate(){ return currentDate; }
    public void setDate(String date){ currentDate = date; }

    public void addItem(ItemToPurchase obj){ cartItems.add(obj); }
    
    public void removeItem(String name){
        for(int i = 0; i < cartItems.size(); i++){
            if(name == cartItems.get(i).getName()){
                cartItems.remove(i);
                System.out.println("Item successfully removed.");
                break;
            }
        }
    }
    public void modifyItem(ItemToPurchase obj){
        for(int i = 0; i < cartItems.size(); i++){
            if(obj.getName() == cartItems.get(i).getName()){
                //if(obj.getDescription() != "none" || obj.getPrice() != 0 || obj.getQuantity() != 0){
                    cartItems.get(i).setQuantity(obj.getQuantity());
                //}
            }else{
                System.out.println("Item not found in cart. Nothing modified.");
            }
        }
    }
    public int getNumItemsInCart(){ return cartItems.size(); }
    public int getCostOfCart(){
        int price = 0;
        for(int i = 0; i < cartItems.size(); i++){
            price += cartItems.get(i).getPrice()*cartItems.get(i).getQuantity();
        }
        return price;
    }
    public void printTotal(){
        System.out.println();
        if(cartItems.size()!=0){
            System.out.println(getCustomerName()+"'s Shopping Cart - "+getDate());
            System.out.println();
            System.out.println("Number of Items: "+getNumItemsInCart());
            for(int i = 0; i < cartItems.size(); i++){
                cartItems.get(i).printItemCost();
            }
            System.out.println();
            System.out.println("Total: $"+getCostOfCart());

        }else{
            System.out.println("SHOPPING CART IS EMPTY");
        }
    }
    public void printDescriptions(){
        System.out.println();
        System.out.println(getCustomerName()+"'s Shopping Cart - "+getDate());
        System.out.println();
        System.out.println("Item Descriptions");
        for(int i =0; i < cartItems.size(); i++){
            System.out.println(cartItems.get(i).getName()+": "+cartItems.get(i).getDescription());
        }
        System.out.println();
    }


}
