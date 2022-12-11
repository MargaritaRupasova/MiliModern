public class BonusMilesService {

    public int calculate(int price) {
        int priceMiles = 20;
        int miles = price / priceMiles;
        return miles;
    }
}
