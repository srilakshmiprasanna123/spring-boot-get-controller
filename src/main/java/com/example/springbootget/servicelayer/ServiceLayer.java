package com.example.springbootget.servicelayer;

import com.example.springbootget.entity.User;
import org.springframework.stereotype.Service;
@Service
public class ServiceLayer {
    public String sayHello(){
            return "Hello World!!";
        }


        public String sayPostHello(User user) {
            User newUser = new User(user);
            return "Hello "+ newUser;
        }
    }

