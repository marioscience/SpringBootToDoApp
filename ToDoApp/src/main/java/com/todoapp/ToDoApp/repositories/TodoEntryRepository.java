package com.todoapp.ToDoApp.repositories;

import java.util.List;

import com.todoapp.ToDoApp.models.ToDoEntry;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "todo_entry", path = "todo_entries")
public interface TodoEntryRepository extends MongoRepository<ToDoEntry, String> {
    List<ToDoEntry> findByDescription(@Param("description") String description);
}
