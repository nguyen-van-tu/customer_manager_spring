package service;

import model.Customer;
import service.ICustomer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService implements ICustomer {
    private static Map<Integer, Customer> customers = new HashMap();

    static {
        customers.put(1, new Customer(1, "tu1", "tutuan1@gmail.com", "nghe an"));
        customers.put(2, new Customer(2, "tu2", "tutuan2@gmail.com", "nghe an"));
        customers.put(3, new Customer(3, "tu3", "tutuan3@gmail.com", "nghe an"));
        customers.put(4, new Customer(4, "tu4", "tutuan4@gmail.com", "nghe an"));
        customers.put(5, new Customer(5, "tu5", "tutuan5@gmail.com", "nghe an"));
    }

    @Override
    public List<Customer> fillAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public Customer save(Customer customer) {
        customers.put(customer.getId(),customer);
        return customer;
    }

    @Override
    public Customer update(Customer customer, int id) {
        customers.replace(id, customer);
        return customer;
    }

    @Override
    public void delete( int id) {
         customers.remove(id);
    }
}
