package com.ruanmattos.hello_world.controller;

import jakarta.annotation.Nullable;
import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloWorldController {

    @GetMapping
    String helloWorld(@PathParam(value = "nome") String nome) {
        String msg = "";
        if (nome != null) {
            char[] charArray = nome.toCharArray();
            for (char ch : charArray) {
                msg += (65 <= ch && ch <= 90) ? " " + ch : "" + ch;
            }
        }
        return "Hello " + ((nome == null) ? "World!" : msg);
    }

}
