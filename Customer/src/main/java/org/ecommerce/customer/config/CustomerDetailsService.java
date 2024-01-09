package org.ecommerce.customer.config;

import org.ecommerce.customer.exception.CustomerBlockedException;
import org.ecommerce.library.model.Customer;
import org.ecommerce.library.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerDetailsService implements UserDetailsService {
    @Autowired
    private CustomerRepository customerRepository;



    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Customer customer = customerRepository.findByEmail(email);

        if (customer != null) {
            if (customer.isActivated()) {
                List<GrantedAuthority> authorities = new ArrayList<>();
                authorities.add(new SimpleGrantedAuthority(customer.getRoles()));

                return new CustomerDetails(
                        customer.getEmail(),
                        customer.getPassword(),
                        authorities,
                        customer.getFirstName(),
                        customer.getLastName(),
                        customer.getMobileNumber(),
                        customer.isActivated()
                );
            } else {
                throw new CustomerBlockedException("Your account has been blocked. Please contact support.");
            }
        } else {
            throw new UsernameNotFoundException("Invalid username or password.");
        }
    }
}

