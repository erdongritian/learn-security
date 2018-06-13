package com.example.learnsecurity.secruity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/todos")
@PreAuthorize("hasRole('USER')")
public class TodoController {


    @RequestMapping(method = RequestMethod.GET)
    public List getAllTodos(@RequestHeader(value = "username") String username) {
        return Arrays.asList(username);
    }
//
//    @RequestMapping(method = RequestMethod.POST)
//    Object addTodo(@RequestBody Todo addedTodo) {
//        return service.addTodo(addedTodo);
//    }
//
//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//    public Todo getTodo(@PathVariable String id) {
//        return service.findById(id);
//    }
//
//    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
//    Todo updateTodo(@PathVariable String id, @RequestBody Todo updatedTodo) {
//        updatedTodo.setId(id);
//        return service.update(updatedTodo);
//    }
//
//    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
//    Todo removeTodo(@PathVariable String id) {
//        return service.deleteTodo(id);
//    }
}
