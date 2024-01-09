package org.ecommerce.library.service;

import org.ecommerce.library.dto.CustomerDto;
import org.ecommerce.library.model.Customer;

import java.util.List;

public interface CustomerService
{
    Customer findByEmail(String email);


    Customer save(CustomerDto customerDto);

    List<Customer> findAll();

    Customer findById(long id);

    void disable(long id);

    void enable(long id);
}
