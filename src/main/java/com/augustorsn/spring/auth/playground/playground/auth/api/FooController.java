package com.augustorsn.spring.auth.playground.playground.auth.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

@RestController
public class FooController {

    @GetMapping("/public")
    public ResponseEntity<String> publicRoute(){
        return ResponseEntity.ok("retorno public");
    }

    @GetMapping("/private")
    public ResponseEntity<String> privateRoute(){
        return ResponseEntity.ok("retorno private");
    }
}
