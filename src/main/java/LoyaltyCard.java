/**
 * Created by davids on 23/02/2017.
 */
public class LoyaltyCard {

    private String barcode;
    private int bonusPoints;

    public LoyaltyCard(String barcode, int bonusPoints) {
        this.barcode = barcode;
        this.bonusPoints = bonusPoints;
    }

    public String getBarcode() {
        return barcode;
    }

    public int getBonusPoints() {
        return bonusPoints;
    }
}
