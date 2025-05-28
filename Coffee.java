public class Coffee {
    protected String name;
    protected float price;
    protected float waterRequired;
    protected float coffeeBeanRequired;

    public Coffee(String name, float price, float waterRequired, float coffeeBeanRequired) {
        this.name = name;
        this.price = price;
        this.waterRequired = waterRequired;
        this.coffeeBeanRequired = coffeeBeanRequired;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public float getWaterRequired() {
        return waterRequired;
    }

    public float getCoffeeBeanRequired() {
        return coffeeBeanRequired;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", waterRequired=" + waterRequired +
                ", coffeeBeanRequired=" + coffeeBeanRequired +
                '}';
    }
}
