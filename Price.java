public abstract class Price {
    public abstract int getPriceCode();
    public abstract double getCharge(int daysRented);
    
    // Versão genérica e concreta do método
    public int getFrequentRenterPoints(int daysRented) {
        return 1;  // Genérico, 1 ponto para todos os filmes, exceto os lançamentos
    }
}
