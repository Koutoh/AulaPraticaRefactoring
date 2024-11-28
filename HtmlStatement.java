import java.util.List;

public class HtmlStatement {

    public String value(Customer aCustomer) {
        List<Rental> rentals = aCustomer.getRentals(); // Obtenção da lista de locações
        String result = "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
        
        for (Rental each : rentals) { // Usando for-each para iterar sobre a lista
            result += each.getMovie().getTitle() + ": " +
                    String.valueOf(each.getCharge()) + "<BR>\n";
        }

        result += "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
        result += "On this rental you earned <EM>" +
                String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                "</EM> frequent renter points<P>";

        return result;
    }
}
