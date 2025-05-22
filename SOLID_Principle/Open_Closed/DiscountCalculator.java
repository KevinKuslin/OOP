package Open_Closed;

public class DiscountCalculator {
    public double calculateDiscount(ICalculateDiscount icalcdc, double amount) {
        return icalcdc.setDiscount(amount); 
    }
} 