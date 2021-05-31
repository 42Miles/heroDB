package com.example.heroDB.repositories;
import com.example.heroDB.models.Message;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;
import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long> {

    List<Message> findByTag(String tag);
    List<Message> deleteById(Integer id);

}
