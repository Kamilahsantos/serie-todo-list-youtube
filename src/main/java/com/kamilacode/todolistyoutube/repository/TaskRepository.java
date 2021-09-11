package com.kamilacode.todolistyoutube.repository;


import com.kamilacode.todolistyoutube.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
