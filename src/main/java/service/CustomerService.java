package service;

import model.Customer;
import service.ICustomer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService implements ICustomer {
    private static List<Customer> customers = new ArrayList<>();

    static {
        customers.add( new Customer(1, "tu1", "tutuan1@gmail.com", "nghe an"));
        customers.add( new Customer(2, "tu2", "tutuan2@gmail.com", "nghe an"));
        customers.add( new Customer(3, "tu3", "tutuan3@gmail.com", "nghe an"));
        customers.add( new Customer(4, "tu4", "tutuan4@gmail.com", "nghe an"));
        customers.add( new Customer(5, "tu5", "tutuan5@gmail.com", "nghe an"));
    }

    @Override
    public List<Customer> fillAll() {
        return customers;
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public boolean update(Customer customer) {
        return false;
    }

    @Override
    public boolean save(Customer customer, int id) {
        return false;
    }
}
