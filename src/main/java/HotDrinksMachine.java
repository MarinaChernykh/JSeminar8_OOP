import java.util.List;

public class HotDrinksMachine extends VendingMachine {

    public HotDrinksMachine(List<Product> list) {

        super(list);
    }

    public HotDrink getProduct(String name, Double volume, int temperature) {
        for (Product item : super.getList()) {
            if (item instanceof HotDrink) {
                if (item.getName().equalsIgnoreCase(name)
                        && ((Drink) item).getVolume().equals(volume)
                        && ((HotDrink) item).getTemperature() == (temperature)) {
                    return (HotDrink) item;
                }
            }
        }
        throw new IllegalStateException("Product not found");
    }
}
