package com.example.demo;

import org.apache.commons.io.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class AiaController {

    @RequestMapping(value = "/aia-webhook", method = POST, consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public String aiaWebhook(HttpServletRequest request) throws IOException {
        final String json = IOUtils.toString(request.getInputStream(), String.valueOf(StandardCharsets.UTF_8));
        System.out.println("json = " + json);
        return "Получен запрос";
    }

    @GetMapping("/test")
    public String test() {
        System.out.println("Получен тестовый запрос");
        return "Получен тестовый запрос";
    }
}
