package com.greenbite.user.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping
    public List<String> getUsers() {
        return List.of("Jairo", "Vicente");
    }
}
