package com.todoapp.ToDoApp.repositories;

import java.util.List;

import com.todoapp.ToDoApp.models.Label;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "label", path = "labels")
public interface LabelRepository extends MongoRepository<Label, String> {
    List<Label> findByName(@Param("label") String name);
}
