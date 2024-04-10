import java.util.ArrayList;
import java.util.List;

public class VendingMachineByWater implements VendingMachine {

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
        VendingMachine vendingMachine = new VendingMachineByWater();

        List<Product> productList = new ArrayList<>();
        productList.add(new BottleWater("Cola", 1.50, "Drinks", 5));
        productList.add(new BottleWater("Soda", 2.50, "Drinks", 3));

        VendingMachine vendingMachine2 = new VendingMachineByWater();

        List<Product> hotDrinksList = new ArrayList<>();
        hotDrinksList.add(new HotDrinks("Tea", 1.4, "Hot Drinks", 15, 45));
        hotDrinksList.add(new HotDrinks("Cofe", 1.9, "Hot Drinks", 20, 40));

        vendingMachine.initProducts(productList);
        vendingMachine2.initProducts(hotDrinksList);
        System.out.println(vendingMachine.getProduct("Tea"));

    }
}
