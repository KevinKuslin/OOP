package Open_Closed;

public class PremiumCustomer implements ICalculateDiscount{

    @Override
    public double setDiscount(double amount){
        return amount * 0.2; 
    }
}
