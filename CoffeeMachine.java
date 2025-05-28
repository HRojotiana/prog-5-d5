public class CoffeeMachine {
    protected InventorySystem inventorySystem;
    protected PaymentSystem paymentSystem;
    protected PowerSupply powerSupply;
    protected CoffeeMenu coffeeMenu;
    private Coffee selectedCoffee;
    private boolean maintenanceMode;

    public CoffeeMachine(InventorySystem inventorySystem, PaymentSystem paymentSystem, PowerSupply powerSupply, CoffeeMenu coffeeMenu, Coffee selectedCoffee, boolean maintenanceMode) {
        this.inventorySystem = inventorySystem;
        this.paymentSystem = paymentSystem;
        this.powerSupply = powerSupply;
        this.coffeeMenu = coffeeMenu;
        this.selectedCoffee = null;
        this.maintenanceMode = false;
    }

    public void select_coffee(String coffeeType) throws Exception {
        if (!coffeeMenu.isValidSelection(coffeeType)) {
            throw new Exception(coffeeType + " is not on the menu.");
        }
        this.selectedCoffee = coffeeMenu.getCoffee(coffeeType);
    }

    public void insert_money(float amount) {
        paymentSystem.insert_money(amount);
    }

    public String prepareCoffee() throws Exception{
        if (maintenanceMode) {
            throw new Exception("Machine under maintenance.");
        }
        if (!powerSupply.is_powered()) {
            throw new Exception("Machine has no power.");
        }
        if (selectedCoffee == null) {
            throw new Exception("No coffee selected.");
        }

        inventorySystem.consume_resources(
                selectedCoffee.getWaterRequired(), selectedCoffee.getCoffeeBeanRequired());

        String coffeeName = selectedCoffee.getName();
        selectedCoffee = null;

        return coffeeName + " is ready! ";
    }

    @Override
    public String toString() {
        return "CoffeeMachine{" +
                "inventorySystem=" + inventorySystem +
                ", paymentSystem=" + paymentSystem +
                ", powerSupply=" + powerSupply +
                ", coffeeMenu=" + coffeeMenu +
                '}';
    }
}
