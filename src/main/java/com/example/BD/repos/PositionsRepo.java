package com.example.BD.repos;

import com.example.BD.domain.Positions;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Mikhail Lukoyanov
 */
public interface PositionsRepo extends CrudRepository<Positions, Long> {
}
