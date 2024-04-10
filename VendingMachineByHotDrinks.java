import java.util.ArrayList;
import java.util.List;

public class VendingMachineByHotDrinks implements VendingMachine {

    private List<Product> products;

    public void initProducts(List<Product> productList) {
        this.products = productList;
    }

    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null; // Если товар не найден
    }

    public static void main(String[] args) {
    
        VendingMachine vendingMachine2 = new VendingMachineByWater();

        List<Product> hotDrinksList = new ArrayList<>();
        hotDrinksList.add(new HotDrinks("Tea", 1.4, "Hot Drinks", 15, 45));
        hotDrinksList.add(new HotDrinks("Cofe", 1.9, "Hot Drinks", 20, 40));

        vendingMachine2.initProducts(hotDrinksList);
        System.out.println(vendingMachine2.getProduct("Tea"));

    }
}
