public class HtmlStatement extends Statement {

    @Override
    protected String header(Customer aCustomer) {
       return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
    }
 
    @Override
    protected String body(Customer aCustomer) {
       StringBuilder result = new StringBuilder();
       for (Rental each : aCustomer.getRentals()) {
          result.append(each.getMovie().getTitle()).append(": ")
                .append(String.valueOf(each.getCharge())).append("<BR>\n");
       }
       return result.toString();
    }
 
    @Override
    protected String footer(Customer aCustomer) {
       String result = "<P>You owe <EM>" + aCustomer.getTotalCharge() + "</EM><P>\n";
       result += "On this rental you earned <EM>" + aCustomer.getTotalFrequentRenterPoints() + "</EM> frequent renter points<P>";
       return result;
    }
 }
 