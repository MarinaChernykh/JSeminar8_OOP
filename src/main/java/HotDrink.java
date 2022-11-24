public class HotDrink extends Drink{

    private int temperature;

    public HotDrink(String name, Double cost, Double volume, int temperature){
        super(name, cost, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + super.getName() + '\'' +
                ", price=" + super.getPrice() + '\'' +
                ", volume=" + super.getVolume() +
                ", temperature=" + temperature +
                '}';
    }
}
