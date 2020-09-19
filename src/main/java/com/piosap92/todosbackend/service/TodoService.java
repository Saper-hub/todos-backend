package com.piosap92.todosbackend.service;

import com.piosap92.todosbackend.entity.Todo;

import java.util.List;

public interface TodoService {

    public List<Todo> findAll();

    public Todo findById(int theId);

    public void save(Todo theTodo);

    public void deleteById(int theId);

}
