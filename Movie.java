public class Movie {
    private String _title;
    private Price _price;
 
    public static final int REGULAR = 0;
    public static final int CHILDRENS = 1;
    public static final int NEW_RELEASE = 2;
 
    public Movie(String name, int priceCode) {
       _title = name;
       setPriceCode(priceCode);
    }
 
    public String getTitle() {
       return _title;
    }
 
    public double getCharge(int daysRented) {
       return _price.getCharge(daysRented); // Chama o método de Price
    }
 
    public int getFrequentRenterPoints(int daysRented) {
       return _price.getFrequentRenterPoints(daysRented);
    }
 
    public void setPriceCode(int arg) {
       switch (arg) {
          case REGULAR:
             _price = new RegularPrice();
             break;
          case CHILDRENS:
             _price = new ChildrensPrice();
             break;
          case NEW_RELEASE:
             _price = new NewReleasePrice();
             break;
          default:
             throw new IllegalArgumentException("Incorrect Price Code");
       }
    }
 
    public int getPriceCode() {
       return _price.getPriceCode();
    }
 }
 