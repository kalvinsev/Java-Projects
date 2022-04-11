package Project_5;

public class PeppermintMocha extends Coffee {

    private int syrupPumps;
    PeppermintMocha(){ super(); }
    PeppermintMocha(String storeName){
        this.setType("Peppermint Mocha");
        this.setPrice(5);
        this.setStoreName(storeName);
        this.syrupPumps = 0;
    }

    public int getSyrupPumps(){ return syrupPumps; }
    public void setSyrupPumps(int syrupPumps){ this.syrupPumps = syrupPumps; }

    @Override
    public void prepare(){
        System.out.println(this.getType());
        ingredient();
    }

    @Override
    public void ingredient(){
        System.out.println("Ingredients: peppermint flakes, milk "+ this.getSyrupPumps()+" pumps of peppermint syrup");
        System.out.println("Quantity: " + this.getQuantity()+"\n");
    }

}
