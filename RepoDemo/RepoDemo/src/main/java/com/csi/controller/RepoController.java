package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RepoController {

    @GetMapping
    public String sayHello(){
        return "Shraddha's repository :)";
    }

    @GetMapping("/kk")
    public String changeByKartik(){
        return "Hello, How are you ...? :)";
    }

    @GetMapping("/address")
    public String sayAddress(){
        return "Akurdi | Pune | Maharashtra | India .";
    }

    @GetMapping("/jobprofile")
    public String sayJobProfile(){
        return " Java Developer.";
    }

}
