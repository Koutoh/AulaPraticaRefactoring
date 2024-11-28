public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("The Lion King", Movie.CHILDRENS);
        Movie movie2 = new Movie("Star Wars", Movie.REGULAR);
        Movie movie3 = new Movie("The Matrix", Movie.NEW_RELEASE);

        Rental rental1 = new Rental(movie1, 5);
        Rental rental2 = new Rental(movie2, 3);
        Rental rental3 = new Rental(movie3, 1);

        Customer customer = new Customer("John Doe");
        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);

        // Print statement in plain text
        System.out.println(customer.statement());

        // Print statement in HTML format
        System.out.println(customer.htmlStatement());
    }
}
