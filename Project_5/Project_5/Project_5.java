package Project_5;
import java.util.Scanner;
import java.util.ArrayList;

public class Project_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Coffee> items = new ArrayList<Coffee>();
        String coffeeShop;
        int key = -1;
        int total = 0;
        System.out.println("Welcome to Coffee World!\n\n------- Among this world, there exists coffee and coffee shops -------\n");
        System.out.print("Enter your favorite coffee shop: ");
        coffeeShop = input.nextLine();
        System.out.println("Select your preferred mocha from the following options, prepared by your favorite shop!\nOR, if your not feeling any of the menu items shown, create your own!\n");
        System.out.println("1) White Chocolate Mocha (150 Calories)\n2) Dark Chocolate Mocha (120 Calories)\n3) Coffee Mocha (100 calories)\n4) Peppermint Mocha (140 calories) *GUEST FAVORITE*\n5) CREATE YOUR OWN");
        System.out.println("Enter '0' to quit");
        key = input.nextInt();
        while(key != 0){
            switch(key){
                case 1: 
                    Coffee whiteChocolate = new WhiteChocolateMocha(coffeeShop);
                    items.add(whiteChocolate);
                    System.out.println("Excellent choice! How many White Chocolate Mochas would you like?");
                    whiteChocolate.setQuantity(input.nextInt());
                    whiteChocolate.prepare();
                    break;
                case 2:
                    Coffee darkChocolate = new DarkChocolateMocha(coffeeShop);
                    items.add(darkChocolate);
                    System.out.println("Fantastic choice! How many Dark Chocolate Mochas would you like?");
                    darkChocolate.setQuantity(input.nextInt());
                    darkChocolate.prepare();
                    break;
                case 3:
                    Coffee coffeeMocha = new CoffeeMocha(coffeeShop);
                    items.add(coffeeMocha);
                    System.out.println("Excellent choice! How many Coffee Mochas would you like?");
                    coffeeMocha.setQuantity(input.nextInt());
                    coffeeMocha.prepare();
                    break;
                case 4:
                    PeppermintMocha peppermintMocha = new PeppermintMocha(coffeeShop);
                    System.out.println("Nice choice! How many pumps of peppermint syrup would you like?");
                    peppermintMocha.setSyrupPumps(input.nextInt());
                    System.out.println("This is a guest favorite! How many Coffee Mochas would you like?");
                    peppermintMocha.setQuantity(input.nextInt());
                    items.add(peppermintMocha);
                    peppermintMocha.prepare();
                    break;
                case 5:
                    CoffeeMocha createYourOwnCoffee = new CoffeeMocha(coffeeShop);
                    items.add(createYourOwnCoffee);
                    createYourOwnCoffee.setType("Create your own");
                    System.out.println("Enter the ingredients of your choosing for your beverage: ");
                    input.nextLine();
                    createYourOwnCoffee.setIngredients(input.nextLine());
                    System.out.println("How many of these beverages with "+createYourOwnCoffee.getIngredients()+" would you like?");
                    createYourOwnCoffee.setQuantity(input.nextInt());
                    createYourOwnCoffee.prepare();
                    break;
                default:
                    break;
            }
            System.out.println("\n---- Your order ---\n");
            for(int i = 0; i < items.size(); i++){
                items.get(i).prepare();
                total += items.get(i).getPrice();

            }
            System.out.println("TOTAL $"+ total+" @ $5 each");
            System.out.println("\n-------------------");
            System.out.println();
            System.out.println("Select your preferred mocha from the following options, prepared by your favorite coffee shop!\nOR -if your not feeling any of the menu items shown, create your own!\n");
            System.out.println("1) White Chocolate Mocha (150 Calories)\n2) Dark Chocolate Mocha (120 Calories)\n3) Coffee Mocha (100 calories)\n4) Peppermint Mocha (140 calories) *GUEST FAVORITE*\n5) CREATE YOUR OWN");
            System.out.println("Enter '0' to quit");
            key = input.nextInt();
        }
        System.out.println("Enjoy!");
        input.close();
    }
    public void print(){

    }
}

