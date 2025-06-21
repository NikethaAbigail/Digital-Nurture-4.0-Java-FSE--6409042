package dependency;

public class Main {
    public static void main(String[] args) {
        
        CustomerRepository repository = new CustomerRepositoryImpl();

        
        CustomerService service = new CustomerService(repository);

       
        String customerId = "C001";
        System.out.println("Finding customer with ID " + customerId + " at 11:26 PM IST, June 21, 2025:");
        String customerName = service.getCustomerName(customerId);
        System.out.println("Customer Name: " + customerName);

        
        customerId = "C003";
        System.out.println("\nFinding customer with ID " + customerId + ":");
        customerName = service.getCustomerName(customerId);
        System.out.println("Customer Name: " + customerName);
    }
}