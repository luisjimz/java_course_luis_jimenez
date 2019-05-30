package com.training.luis.lesson6rest;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private AtomicLong counter = new AtomicLong();

    //http://localhost:8080/hello/path/Luis
    @GetMapping("/hello/path/{name}")
    public Greeting sayHello(@PathVariable String name){
         long id = counter.incrementAndGet();
         String message = "Hello " + name;
         return new Greeting(id, message);
    }

    //http://localhost:8080/hello/param?name=Luis
    //http://localhost:8080/hello/param?name=
    @GetMapping("/hello/param")
    public Greeting sayHelloParam(@RequestParam (value = "name", defaultValue = "World") String name){
        long id = counter.incrementAndGet();
        String message = "Hello " + name;
        return new Greeting(id, message);
    }
}
