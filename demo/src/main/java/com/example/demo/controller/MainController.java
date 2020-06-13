package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
public class MainController {

    private final UserService service;

    @Autowired
    public MainController(UserService service) {
        this.service = service;
    }

    @GetMapping("/students")
    public List<User> findAll(Model model){
        return service.findAll();
    }

    @PostMapping("/create-user")
    public User addUser(@RequestBody User user){
        return service.saveUser(user);
    }

    @PutMapping("{id}")
    public User update(@PathVariable Long id, @RequestBody User newUser){
        return service.saveUser(newUser);
    }

    @DeleteMapping("{id}")
    public void deleteUser(@PathVariable Long id){
        service.deleteById(id);
    }
}
