package com.example.TestSpringProject.repo;


import com.example.TestSpringProject.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message,Long> {

}
