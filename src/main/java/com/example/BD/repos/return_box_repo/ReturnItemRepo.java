package com.example.BD.repos.return_box_repo;

import com.example.BD.domain.return_box.ReturnItem;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Mikhail Lukoyanov
 */
public interface ReturnItemRepo extends CrudRepository<ReturnItem, Long> {
}
