package com.example.BD.repos;

import com.example.BD.domain.Workers;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Mikhail Lukoyanov
 */
public interface WorkersRepo extends CrudRepository<Workers, Long> {
    List<Workers> findByPositions_IdAndSubsidiary_Id(Long positionId, Long subsidiaryId);

    List<Workers> findBySubsidiary_Id(Long subsidiaryId);
    List<Workers> findByPositions_Id(Long positionsId);
}
