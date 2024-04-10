import java.util.List;

/**
 * VendingMachine
 */
public interface VendingMachine {

    void initProducts(List<Product> productLst);

    Product getProduct(String name);
}