public class InventorySystem {
    protected float waterQuantity;
    protected float coffeeQuantity;

    public InventorySystem(float waterQuantity, float coffeeQuantity) {
        this.waterQuantity = waterQuantity;
        this.coffeeQuantity = coffeeQuantity;
    }

    public boolean check_resources(float requiredWater, float requiredCoffee) {
        if((waterQuantity >= requiredWater) && (coffeeQuantity >= requiredCoffee)){
            return true;
        }
        return false;
    }

    public void consume_resources(float requiredWater, float requiredCoffee) {
        if (!check_resources(requiredWater, requiredCoffee)) {
            throw new IllegalArgumentException("Out of resources");
        } else {
            waterQuantity -= requiredWater;
            coffeeQuantity -= requiredCoffee;
            System.out.println("Actual water quantity: "+ waterQuantity + " L" +
                    "\n Actual coffee quantity: " + coffeeQuantity +  " kg");
        }
    }

    @Override
    public String toString() {
        return "InventorySystem{" +
                "waterQuantity=" + waterQuantity +
                ", coffeQuantity=" + coffeeQuantity +
                '}';
    }
}
