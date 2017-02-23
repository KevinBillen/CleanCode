import java.util.HashMap;
import java.util.Map;

/**
 * Created by davids on 23/02/2017.
 */
public class Groceries {

    private Map<String, Integer> shoppingCart;

    public Groceries() {
        this.shoppingCart = new HashMap<>();
    }

    public Map<String, Integer> getShoppingCart() {
        return shoppingCart;
    }

    public void buyItem(String item, int quantity) {
        if (shoppingCart.containsKey(item)) {
            updateItem(item, quantity);
        } else {
            addItem(item, quantity);
        }
    }

    private void addItem(String item, int quantity) {
        shoppingCart.put(item, quantity);
    }

    private void updateItem(String item, int quantity) {
        int temp = shoppingCart.get(item);
        addItem(item, temp+quantity);
    }
}
