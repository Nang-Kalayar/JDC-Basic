package org.example.todolist.controller;

import lombok.RequiredArgsConstructor;
import org.example.todolist.dao.TodoItemDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class TodoController {
    private final TodoItemDao todoItemDao;
    @GetMapping("/")
    public String welcome(Model model){

        model.addAllAttribute("todoItems", todoItemDao.findAll());
        return "index";
    }
    public String todoForm(TodoItem todoItem){
      return "index";
    }
}
