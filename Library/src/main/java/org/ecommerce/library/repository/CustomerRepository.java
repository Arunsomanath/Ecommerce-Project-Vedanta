package org.ecommerce.library.repository;

import org.ecommerce.library.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>
{
    Customer findByEmail(String email);

    Customer findById(long id);
}
