
package com.example.springbootget.controller;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class SpringBootController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello from Bridgelabz";
    }

    @GetMapping("/web")
    public String index(){
        return "Homepage";
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name){
        return "Hello good morning"+name;
    }

    @GetMapping("/param/{name}")
    public  String sayHelloParam(@PathVariable String name){
        return "Hello"+ name+ "!";
    }

    @PostMapping("/post")
    public String sayHello(@RequestBody User user){
        return "Hello"+user.getFullName()+" "+user.getUsername();
    }

    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName){
        return "Hello"+firstName+" "+lastName;
    }
}

