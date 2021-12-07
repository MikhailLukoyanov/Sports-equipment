package com.example.BD.repos;

import com.example.BD.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Mikhail Lukoyanov
 */
public interface MessageRepo extends CrudRepository<Message, Long> {

    List<Message> findByTag(String tag);

}
