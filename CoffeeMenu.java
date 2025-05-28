import java.util.Map;

public class CoffeeMenu {
    protected Map<String, Coffee> menu;

    public CoffeeMenu(Map<String, Coffee> menu) {
        this.menu = menu;
    }

    public Coffee getCoffee(String name) {
        return menu.get(name.toLowerCase());
    }

    public boolean isValidSelection(String name) {
        return menu.containsKey(name.toLowerCase());
    }

    @Override
    public String toString() {
        return "CoffeeMenu{" +
                "menu=" + menu +
                '}';
    }
}
