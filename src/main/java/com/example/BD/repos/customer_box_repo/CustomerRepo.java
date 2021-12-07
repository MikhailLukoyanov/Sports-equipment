package com.example.BD.repos.customer_box_repo;

import com.example.BD.domain.customer_box.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Mikhail Lukoyanov
 */
public interface CustomerRepo extends CrudRepository<Customer, Long> {
}
