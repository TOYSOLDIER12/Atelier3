package ma.xproce.customerservice.web;

import ma.xproce.customerservice.entities.Customer;
import ma.xproce.customerservice.repository.CustomerRepository;
import ma.xproce.customerservice.service.CustomerManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerRestController {
    @Autowired
    CustomerManager customerManager;
    @GetMapping("/customers")
    public List<Customer> customers(){
        return customerManager.customerList();
    }
    public Customer save(Customer customer){
        return customerManager.saveCustomer(customer);
    }
    @GetMapping("/customers/{id}")
    public Customer getCustomer(Long id){
        return customerManager.customerById(id);
    }

}

