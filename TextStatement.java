import java.util.List;

public class TextStatement {

    public String value(Customer aCustomer) {
        List<Rental> rentals = aCustomer.getRentals(); // Obtenção da lista de locações
        String result = "Rental Record for " + aCustomer.getName() + "\n";
        
        for (Rental each : rentals) { // Usando for-each para iterar sobre a lista
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    String.valueOf(each.getCharge()) + "\n";
        }

        result += "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                " frequent renter points";

        return result;
    }
}
