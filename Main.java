public class Main {
    public static void main(String[] args) {
       // Criando filmes com diferentes tipos de preços
       Movie regularMovie = new Movie("The Godfather", Movie.REGULAR);
       Movie newReleaseMovie = new Movie("Avengers: Endgame", Movie.NEW_RELEASE);
       Movie childrensMovie = new Movie("Frozen", Movie.CHILDRENS);
 
       // Definindo os dias alugados para cada filme
       int daysRentedRegular = 5;
       int daysRentedNewRelease = 3;
       int daysRentedChildrens = 4;
 
       // Exibindo os resultados de charge e pontos de frequent renter para cada filme
       System.out.println("Rental Record for Regular Movie");
       System.out.println("\t" + regularMovie.getTitle() + "\t" + regularMovie.getCharge(daysRentedRegular));
       System.out.println("Frequent Renter Points: " + regularMovie.getFrequentRenterPoints(daysRentedRegular));
 
       System.out.println("\nRental Record for New Release Movie");
       System.out.println("\t" + newReleaseMovie.getTitle() + "\t" + newReleaseMovie.getCharge(daysRentedNewRelease));
       System.out.println("Frequent Renter Points: " + newReleaseMovie.getFrequentRenterPoints(daysRentedNewRelease));
 
       System.out.println("\nRental Record for Children's Movie");
       System.out.println("\t" + childrensMovie.getTitle() + "\t" + childrensMovie.getCharge(daysRentedChildrens));
       System.out.println("Frequent Renter Points: " + childrensMovie.getFrequentRenterPoints(daysRentedChildrens));
    }
 }
 