package org.example.todolist.dao;

import org.example.todolist.entity.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoItemDao extends JpaRepository<TodoItem,Integer> {
}
