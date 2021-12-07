package com.example.BD.repos.goods_repo;

import com.example.BD.domain.goods.Products;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Mikhail Lukoyanov
 */
public interface ProductsRepo extends CrudRepository<Products, Long> {
}
