public abstract class Statement {

    public String value(Customer aCustomer) {
       String result = header(aCustomer);
       result += body(aCustomer);
       result += footer(aCustomer);
       return result;
    }
 
    // Métodos abstratos que serão implementados pelas subclasses
    protected abstract String header(Customer aCustomer);
    protected abstract String body(Customer aCustomer);
    protected abstract String footer(Customer aCustomer);
 }
 