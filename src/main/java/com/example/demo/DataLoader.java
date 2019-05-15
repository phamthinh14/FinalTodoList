package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    TodoListRepository todoListRepository;

    @Override
    public void run(String... args) throws Exception {
        TodoList todoList = new TodoList("Sweep Floor", "02/12/19", 5);
        todoListRepository.save(todoList);
        todoList = new TodoList("Clean Floor", "22/2/95", 52);
        todoListRepository.save(todoList);
        todoList = new TodoList("Mopped Floor", "1/4/95", 2);
        todoListRepository.save(todoList);

    }
}
