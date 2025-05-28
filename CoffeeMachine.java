public class CoffeeMachine {
    protected InventorySystem inventorySystem;
    protected PaymentSystem paymentSystem;
    protected PowerSupply powerSupply;

    public CoffeeMachine(InventorySystem inventorySystem, PaymentSystem paymentSystem, PowerSupply powerSupply) {
        this.inventorySystem = inventorySystem;
        this.paymentSystem = paymentSystem;
        this.powerSupply = powerSupply;
    }
}
