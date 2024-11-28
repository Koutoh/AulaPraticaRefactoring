// Classe Movie
public class Movie {
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDRENS = 2;

    private String _title;
    private int _priceCode;

    public Movie(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
    }

    // Método que define a cobrança dependendo do tipo de filme e dias alugados
    public double getCharge(int daysRented) {
        double result = 0;

        switch (_priceCode) {
            case REGULAR:
                result += 2;
                if (daysRented > 2)
                    result += (daysRented - 2) * 1.5;
                break;
            case NEW_RELEASE:
                result += daysRented * 3;
                break;
            case CHILDRENS:
                result += 1.5;
                if (daysRented > 3)
                    result += (daysRented - 3) * 1.5;
                break;
        }
        return result;
    }

    // Método que retorna os pontos de locação de acordo com a política
    public int getFrequentRenterPoints(int daysRented) {
        int result = 1;
        if (_priceCode == Movie.NEW_RELEASE && daysRented > 1)
            result++;  // Bonus de pontos para filmes novos alugados por mais de 1 dia
        return result;
    }

    // Outros métodos
    public String getTitle() {
        return _title;
    }

    public int getPriceCode() {
        return _priceCode;
    }
}
