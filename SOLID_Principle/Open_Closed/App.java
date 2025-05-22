package Open_Closed; 

public class App {
    public static void main(String[] arg) {
            DiscountCalculator calc = new DiscountCalculator();
            
            double price = 100000;
            double discount;
            
            discount = calc.calculateDiscount(new SilverCustomer(), price);
    }
}