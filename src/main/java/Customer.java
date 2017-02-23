import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by davids on 23/02/2017.
 */
public class Customer {

    private LoyaltyCard loyaltyCard;
    private Map<LocalDate, Groceries> groceriesHistory;

    public Customer(LoyaltyCard loyaltyCard) {
        this.loyaltyCard = loyaltyCard;
        this.groceriesHistory = new HashMap<>();
    }

    public LoyaltyCard getLoyaltyCard() {
        return loyaltyCard;
    }

    public void addGrocery(LocalDate date, Groceries groceries){
        if (groceriesHistory.containsKey(date)) {
            addGroceriesOnDate(groceries, date);
        } else {
            groceriesHistory.put(date, groceries);
        }
    }

    private void addGroceriesOnDate(Groceries groceries, LocalDate date) {
        Groceries currentlySavedGroceries = groceriesHistory.get(date);
        groceries.getShoppingCart().forEach(currentlySavedGroceries::addToShoppingCart);
    }

    public Map<LocalDate, Groceries> getGroceriesHistory() {
        return groceriesHistory;
    }
}
