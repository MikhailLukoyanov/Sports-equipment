package com.example.BD.repos.goods_repo;

import com.example.BD.domain.goods.Suppliers;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Mikhail Lukoyanov
 */
public interface SuppliersRepo extends CrudRepository<Suppliers, Long> {
}
