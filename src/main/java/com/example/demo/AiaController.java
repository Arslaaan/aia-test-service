package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AiaController {

    @PostMapping("/send")
    public String send() {
        System.out.println("Получен запрос");
        return "Получен запрос";
    }

    @GetMapping("/test")
    public String test() {
        System.out.println("Получен тестовый запрос");
        return "Получен тестовый запрос";
    }
}
