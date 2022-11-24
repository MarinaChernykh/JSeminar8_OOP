import java.util.ArrayList;
import java.util.List;


public class VendingMachine {
    private final List<Product> list;

    public VendingMachine(List<Product> list) {
        this.list = list;
    }

    public List<Product> getList() {
        return list;
    }

    public Product getProductByName(String name){
        for (Product item: this.list){
            if (item.getName().equals(name)){
                return item;
            }
        }
        throw new IllegalStateException("Product not found");
    }
}
