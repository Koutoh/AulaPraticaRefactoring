import java.util.Enumeration;
import java.util.List;
import java.util.ArrayList;

public class Customer {
   private String _name;
   private List<Rental> _rentals = new ArrayList<>(); // Usando ArrayList como implementação de List

   public Customer(String name) {
       _name = name;
   }

   public void addRental(Rental arg) {
       _rentals.add(arg); // Agora usando List
   }

   public String getName() {
       return _name;
   }

   public List<Rental> getRentals() {
       return _rentals; // Retornando a lista diretamente
   }

   public double getTotalCharge() {
       double result = 0;
       for (Rental each : _rentals) {
           result += each.getCharge(); // Usando for-each para acessar os elementos
       }
       return result;
   }

   public int getTotalFrequentRenterPoints() {
       int result = 0;
       for (Rental each : _rentals) {
           result += each.getFrequentRenterPoints(); // Usando for-each para acessar os elementos
       }
       return result;
   }

   public String statement() {
       return new TextStatement().value(this);
   }

   public String htmlStatement() {
       return new HtmlStatement().value(this);
   }
}

