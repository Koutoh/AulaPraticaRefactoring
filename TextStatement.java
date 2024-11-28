public class TextStatement extends Statement {

    @Override
    protected String header(Customer aCustomer) {
       return "Rental Record for " + aCustomer.getName() + "\n";
    }
 
    @Override
    protected String body(Customer aCustomer) {
       StringBuilder result = new StringBuilder();
       for (Rental each : aCustomer.getRentals()) {
          result.append("\t").append(each.getMovie().getTitle()).append("\t")
                .append(String.valueOf(each.getCharge())).append("\n");
       }
       return result.toString();
    }
 
    @Override
    protected String footer(Customer aCustomer) {
       String result = "Amount owed is " + aCustomer.getTotalCharge() + "\n";
       result += "You earned " + aCustomer.getTotalFrequentRenterPoints() + " frequent renter points";
       return result;
    }
 }
 