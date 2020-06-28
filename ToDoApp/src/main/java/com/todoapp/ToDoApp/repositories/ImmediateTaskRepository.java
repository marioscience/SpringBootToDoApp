package com.todoapp.ToDoApp.repositories;

import java.util.List;

import com.todoapp.ToDoApp.models.ImmediateTask;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "immediate_task", path = "immediate_tasks")
public interface ImmediateTaskRepository extends MongoRepository<ImmediateTask, String> {
    List<ImmediateTask> findByTitle(@Param("title") String title);
}
