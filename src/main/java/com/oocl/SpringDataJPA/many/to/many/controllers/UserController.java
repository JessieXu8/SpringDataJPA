package com.oocl.SpringDataJPA.many.to.many.controllers;

import com.oocl.SpringDataJPA.many.to.many.entities.User;
import com.oocl.SpringDataJPA.many.to.many.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Transactional
    @PostMapping(path = "",produces = MediaType.APPLICATION_JSON_VALUE)
    public User save(@RequestBody User user){

        return userRepository.save(user);
    }

    @Transactional
    @GetMapping(path = "",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> getAll(){
        return userRepository.findAll();
    }

}
