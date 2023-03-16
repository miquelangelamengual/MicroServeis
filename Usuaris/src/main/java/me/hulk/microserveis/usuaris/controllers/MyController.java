package me.hulk.microserveis.usuaris.controllers;

import me.hulk.microserveis.usuaris.domain.Usuari;
import me.hulk.microserveis.usuaris.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<Usuari> hello() {
        return userService.findAll();
    }

}
