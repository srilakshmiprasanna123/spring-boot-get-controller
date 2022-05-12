
package com.example.springbootget.controller;


import com.example.springbootget.entity.User;
import com.example.springbootget.servicelayer.ServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class SpringBootController {

    @Autowired
    ServiceLayer serviceLayer;

    @GetMapping("/")
    public String sayHello(){
        String response = serviceLayer.sayHello();
        return response;
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
        return "Hello"+user.getFirstName()+" "+user.getLastName();
    }

    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName){
        return "Hello"+firstName+" "+lastName;
    }
}

