package com.piosap92.todosbackend.dao;

import com.piosap92.todosbackend.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Integer> {

}
