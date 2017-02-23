import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by davids on 23/02/2017.
 */
public class Customer {

    private LoyaltyCard loyaltyCard;
    private String name;
    private Map<LocalDate, Groceries> groceriesHistory;

    public Customer(LoyaltyCard loyaltyCard, String name) {
        this.loyaltyCard = loyaltyCard;
        this.name = name;
        this.groceriesHistory = new HashMap<>();
    }

    public LoyaltyCard getLoyaltyCard() {
        return loyaltyCard;
    }

    public String getName() {
        return name;
    }

    public void addGrocery(LocalDate date, Groceries groceries) throws Exception{
        if (groceriesHistory.containsKey(date)) {
            throw new Exception("Not allowed");
        } else {
            groceriesHistory.put(date, groceries);
        }
    }

    public Map<LocalDate, Groceries> getGroceriesHistory() {
        return groceriesHistory;
    }
}
