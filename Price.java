public abstract class Price {
    public abstract int getPriceCode();
 
    public abstract double getCharge(int daysRented); // Método movido para Price
 
    public abstract int getFrequentRenterPoints(int daysRented);
 }
 