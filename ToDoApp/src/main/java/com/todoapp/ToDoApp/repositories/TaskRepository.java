package com.todoapp.ToDoApp.repositories;

import java.util.List;

import com.todoapp.ToDoApp.models.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "task", path = "tasks")
public interface TaskRepository extends MongoRepository<Task, String> {
    List<Task> findByTitle(@Param("title") String title);
}
