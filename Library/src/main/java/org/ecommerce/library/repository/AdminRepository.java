package org.ecommerce.library.repository;

import org.ecommerce.library.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long>
{
    Admin findByEmail(String Email);
}
