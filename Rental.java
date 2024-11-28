// Classe Rental
public class Rental {
   private Movie _movie;
   private int _daysRented;

   public Rental(Movie movie, int daysRented) {
       _movie = movie;
       _daysRented = daysRented;
   }

   // Método modificado: agora apenas delega a responsabilidade para a classe Movie
   public double getCharge() {
       return _movie.getCharge(_daysRented);  // Chama o método em Movie
   }

   public int getFrequentRenterPoints() {
       return _movie.getFrequentRenterPoints(_daysRented); // Retorna pontos de locação
   }

   // Outros métodos
   public Movie getMovie() {
       return _movie;
   }

   public int getDaysRented() {
       return _daysRented;
   }
}
