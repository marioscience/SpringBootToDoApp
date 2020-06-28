package com.todoapp.ToDoApp.repositories;

import java.util.List;

import com.todoapp.ToDoApp.models.ScheduledTask;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "scheduled_task", path = "scheduled_tasks")
public interface ScheduledTaskRepository extends MongoRepository<ScheduledTask, String> {
    List<ScheduledTask> findByTitle(@Param("title") String title);
}
