package Open_Closed;

public class RegularCustomer implements ICalculateDiscount{

    @Override 
    public double setDiscount(double amount){
        return amount * 0.1; 
    }
}