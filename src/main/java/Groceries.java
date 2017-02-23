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

    public void addToShoppingCart(String item, int quantity) {
        if (itemIsAlreadyIsShoppingCart(item)) {
            updateAmount(item, quantity);
        } else {
            storeInShoppingCart(item, quantity);
        }
    }

    private boolean itemIsAlreadyIsShoppingCart(String item) {
        return shoppingCart.containsKey(item);
    }

    private void storeInShoppingCart(String item, int quantity) {
        shoppingCart.put(item, quantity);
    }

    private void updateAmount(String item, int quantity) {
        int newAmount = shoppingCart.get(item) + quantity;
        storeInShoppingCart(item, newAmount);
    }
}
