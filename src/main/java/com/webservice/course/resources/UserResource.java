package com.webservice.course.resources;

import com.webservice.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Carlos", "carlos@gmail.com","99999-9999", "123456");
        return ResponseEntity.ok().body(u);
    }

}
