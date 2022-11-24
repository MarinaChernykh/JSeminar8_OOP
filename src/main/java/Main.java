import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>(Arrays.asList(
                new Product("Шоколад", 100.0),
                new Product("Вода", 75.0))
        );
        VendingMachine machine = new VendingMachine(list);
        String name = "Вода";
        System.out.println(machine.getProductByName(name));


        List<Product> bottleList = new ArrayList<Product>(Arrays.asList(
                new Drink("Coca-Cola", 80.0, 0.5),
                new Drink("Sprite", 80.0, 0.5))
        );
        VendingMachine bottleMachine = new BottleVendingMachine(bottleList);
        String bottleName = "Coca-Cola";
        System.out.println(bottleMachine.getProductByName(bottleName));


        List<Product> hotDrinksList = new ArrayList<Product>(Arrays.asList(
                new HotDrink("Black Coffee", 50.0, 0.1, 80),
                new HotDrink("Latte", 90.0, 0.2, 70),
                new HotDrink("Tea", 50.0, 0.2, 90))
        );
//        System.out.println(hotDrinksList);
        HotDrinksMachine hotDrinksMachine = new HotDrinksMachine(hotDrinksList);
        String hotDrinkName = "Black Coffee";
        Double hotDrinkVolume = 0.1;
        int hotDrinkTemperature = 80;
        System.out.println(hotDrinksMachine.getProduct(hotDrinkName, hotDrinkVolume, hotDrinkTemperature));
    }
}
