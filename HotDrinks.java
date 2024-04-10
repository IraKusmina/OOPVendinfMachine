
public class HotDrinks extends Product{
    protected static int temp;

    public static int getTemp(){
        return temp;
    }

    public void setTemp(int temp){
        HotDrinks.temp = temp;
    }
    
    public HotDrinks(String name, double price, String category, int amount, int temp){

        
        super(name, price, category, amount, getTemp());
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + amount + ", temp= " + temp + 
                '}';
    }
}
