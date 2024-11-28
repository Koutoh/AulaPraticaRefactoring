public class NewReleasePrice extends Price {
    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    public double getCharge(int daysRented) {
        return daysRented * 3;
    }

    // Sobrescrita da versão do método para o caso especial
    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;  // 2 pontos se o aluguel for maior que 1 dia
    }
}
