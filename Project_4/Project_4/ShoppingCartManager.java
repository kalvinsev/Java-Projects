//Kalvin Sevillano
//Project 4
package Project_4;
import java.util.Scanner;

public class ShoppingCartManager {
    public static void main(String[]args) {

        ShoppingCart user = new ShoppingCart();
        print(user);
       
    }

    public static void print(ShoppingCart cart){
        Scanner input =  new Scanner(System.in);

        System.out.println("Enter Customer's Name:");
        cart.setCustomerName(input.nextLine());
        System.out.println("Enter Today's Date:");
        cart.setDate(input.nextLine());
        System.out.println("Customer's Name: "+cart.getCustomerName());
        System.out.println("Today's Date: "+cart.getDate());
        System.out.println();
        
        char key = ' ';
        System.out.println("MENU");
        System.out.println("a - Add item to cart\nd - Remove item from Cart\nc - Change item Quantity\ni - Output items' description\no - Output shopping cart\nq - quit");
        key  = input.next().charAt(0);
        while(key != 'q'){
            switch(key){
                case 'a':
                    ItemToPurchase obj = new ItemToPurchase();
                    System.out.println();
                    System.out.println("ADD ITEM TO CART");
                    System.out.println("Enter the item name:");
                    obj.setName(input.next());
                    input.nextLine();
                    System.out.println("Enter the item price:");
                    obj.setPrice(input.nextInt());
                    input.nextLine();
                    System.out.println("Enter the item description:");
                    obj.setDescription(input.nextLine());
                    System.out.println("Enter the item quantity:");
                    obj.setQuantity(input.nextInt());
                    cart.addItem(obj);
                    break;
                case 'd':
                    System.out.println("REMOVE ITEM FROM CART");
                    System.out.println("Enter name of item to remove: ");
                    cart.removeItem(input.next());
                    break;
                case 'c':
                    ItemToPurchase newItem = new ItemToPurchase();
                    System.out.println("CHANGE ITEM QUANTITY");
                    System.out.println("Enter the item name: ");
                    newItem.setName(input.next());
                    System.out.println("Enter the item quantity: ");
                    newItem.setQuantity(input.nextInt());
                    cart.modifyItem(newItem);
                    break;
                case 'i':
                    cart.printDescriptions();
                    break;
                case 'o':
                    cart.printTotal();
                    break;
                default:
                    break;
            }
            System.out.println();
            System.out.println("MENU");
            System.out.println("a - Add item to cart\nd - Remove item from Cart\nc - Change item Quantity\ni - Output items' description\no - Output shopping cart\nq - quit");
            key = input.next().charAt(0);
        }
        
        System.out.println("Fuck you");
        input.close();
    }
}

