package service;

import model.Customer;

import java.util.List;

public interface ICustomer {
List<Customer> fillAll();
    Customer findById(int id);
    boolean update(Customer customer);
    boolean save(Customer customer, int id);
}
