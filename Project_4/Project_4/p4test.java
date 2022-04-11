package Project_4;
import java.util.ArrayList;

public class p4test {
    public static void main(String[] args) {
        ArrayList<ItemToPurchase> arr = new ArrayList<ItemToPurchase>();
        ItemToPurchase item = new ItemToPurchase("Kal", "Hal", 1, 1);
        ItemToPurchase item2 = new ItemToPurchase("bal", "Hal", 1, 1);
        ItemToPurchase item3 = new ItemToPurchase("lal", "Hal", 1, 1);
        arr.add(item);
        arr.add(item2);
        arr.add(item3);
        for(int i = 0; i < arr.size(); i++){
            if("lal" == arr.get(i).getName()){
                arr.remove(i);
                break;
            }
        }
        for(int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i).getName());
            }
        }
    }

