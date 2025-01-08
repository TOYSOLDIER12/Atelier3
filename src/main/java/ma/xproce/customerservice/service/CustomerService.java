package ma.xproce.customerservice.service;

import ma.xproce.customerservice.entities.Customer;
import ma.xproce.customerservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService implements CustomerManager {
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public List<Customer> customerList(){
        return customerRepository.findAll();
    }



    @Override
    public Customer customerById(Long id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
