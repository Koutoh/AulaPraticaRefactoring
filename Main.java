public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Movie
        Movie movie1 = new Movie("The Lion King", Movie.CHILDRENS);
        Movie movie2 = new Movie("Inception", Movie.REGULAR);
        Movie movie3 = new Movie("Avengers: Endgame", Movie.NEW_RELEASE);

        // Criando instâncias de Rental
        Rental rental1 = new Rental(movie1, 5);
        Rental rental2 = new Rental(movie2, 3);
        Rental rental3 = new Rental(movie3, 1);

        // Criando instância de Customer
        Customer customer = new Customer("John Doe");

        // Adicionando aluguéis ao cliente
        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);

        // Exibindo o relatório de aluguéis
        System.out.println(customer.statement());
    }
}
