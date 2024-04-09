package project;

public class PriceCalculations {

    private TertiaryController tertiary;

    Integer[] prices = {80, 30, 35, 10, 15, 30, 20, 30, 120, 5, 100, 40};

    int totalPrice = 0;


    public PriceCalculations() {
        tertiary = new TertiaryController();
    }
    
    public int calculatePrice() {
        int firstBox = tertiary.checked.get(0) - 1;
        int secondBox = tertiary.checked.get(1) - 1;
        int thirdBox = tertiary.checked.get(2) - 1;
        totalPrice += prices[firstBox];
        totalPrice += prices[secondBox];
        totalPrice += prices[thirdBox];
        return totalPrice;
    }
    
}
