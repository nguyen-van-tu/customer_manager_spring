package service;

import model.Customer;

import java.util.List;

public interface ICustomer {
List<Customer> fillAll();
    Customer findById(int id);
    Customer save(Customer customer);
    Customer update(Customer customer, int id);
    void delete( int id);
}
