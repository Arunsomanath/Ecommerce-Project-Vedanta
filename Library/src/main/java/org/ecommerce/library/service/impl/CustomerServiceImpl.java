package org.ecommerce.library.service.impl;

import org.ecommerce.library.dto.CustomerDto;
import org.ecommerce.library.model.Customer;
import org.ecommerce.library.repository.CustomerRepository;
import org.ecommerce.library.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService
{
    @Autowired
    private CustomerRepository customerRepository;



    @Override
    public Customer findByEmail(String email) {

        return customerRepository.findByEmail(email);
    }

    @Override
    public Customer save(CustomerDto customerDto) {
        Customer customer = new Customer();
        customer.setFirstName(customerDto.getFirstName());
        customer.setLastName(customerDto.getLastName());
        customer.setMobileNumber(customerDto.getMobileNumber());
        customer.setActivated(true);
        customer.setPassword((customerDto.getPassword()));
        customer.setEmail(customerDto.getEmail());
        customer.setRoles("User");
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void disable(long id) {
        Customer customer=findById(id);
        customer.setActivated(false);
        customerRepository.save(customer);

    }

    @Override
    public void enable(long id) {
        Customer customer = findById(id);
        customer.setActivated(true);
        customerRepository.save(customer);
    }

}
