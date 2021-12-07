package com.example.BD.repos.goods_repo;

import com.example.BD.domain.goods.PriceList;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Mikhail Lukoyanov
 */
public interface PriceListRepo extends CrudRepository<PriceList, Long> {
}
