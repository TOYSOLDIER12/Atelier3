package ma.xproce.customerservice.service;

import ma.xproce.customerservice.entities.Customer;

import java.util.List;

public interface CustomerManager {

    public List<Customer> customerList();
     public Customer customerById(Long id);
    public Customer saveCustomer(Customer customer);
}
