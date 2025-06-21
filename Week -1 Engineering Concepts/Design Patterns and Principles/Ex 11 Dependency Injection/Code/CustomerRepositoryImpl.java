package dependency;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<String, String> customerDatabase;

    public CustomerRepositoryImpl() {
        customerDatabase = new HashMap<>();
        customerDatabase.put("C001", "John Doe");
        customerDatabase.put("C002", "Jane Smith");
    }

    @Override
    public String findCustomerById(String id) {
        return customerDatabase.getOrDefault(id, "Customer not found");
    }
}
