package Project_4;
import java.util.*;
public class ShoppingCartPrinter {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        ItemToPurchase item1 = new ItemToPurchase();
        ItemToPurchase item2 = new ItemToPurchase();
        whatever bro = new whatever();
        System.out.println(bro.getDescription());
        item1.setName(input.nextLine());
        System.out.println("Enter the item price:");
        item1.setPrice(input.nextInt());
        System.out.println("Enter the item quantity:");
        item1.setQuantity(input.nextInt());
        input.nextLine();
        System.out.println("Enter the item name:");
        item2.setName(input.nextLine());
        System.out.println("Enter the item price:");
        item2.setPrice(input.nextInt());
        System.out.println("Enter the item quantity:");
        item2.setQuantity(input.nextInt());

        System.out.println("TOTAL COST");
        System.out.println(item1.getName()+" "+item1.getQuantity()+" @ $"+item1.getPrice()+" = $"+item1.getPrice()*item1.getQuantity());
        System.out.println(item2.getName()+" "+item2.getQuantity()+" @ $"+item2.getPrice()+" = $"+item2.getPrice()*item2.getQuantity());
        int total = item1.getPrice()+item2.getPrice();
        System.out.println(total);
        input.close();
    }
}