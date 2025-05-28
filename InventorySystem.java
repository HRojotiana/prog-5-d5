public class InventorySystem {
    protected float waterQuantity;
    protected float coffeQuantity;

    public InventorySystem(float waterQuantity, float coffeQuantity) {
        this.waterQuantity = waterQuantity;
        this.coffeQuantity = coffeQuantity;
    }

    @Override
    public String toString() {
        return "InventorySystem{" +
                "waterQuantity=" + waterQuantity +
                ", coffeQuantity=" + coffeQuantity +
                '}';
    }
}
