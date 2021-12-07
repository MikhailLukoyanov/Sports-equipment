package com.example.BD.repos.customer_box_repo;

import com.example.BD.domain.customer_box.CustomerCart;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Mikhail Lukoyanov
 */
public interface CustomerCartRepo extends CrudRepository<CustomerCart, Long> {
}
