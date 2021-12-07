package com.example.BD.repos.goods_repo;

import com.example.BD.domain.goods.ProductName;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Mikhail Lukoyanov
 */
public interface ProductNameRepo extends CrudRepository<ProductName, Long > {
}
