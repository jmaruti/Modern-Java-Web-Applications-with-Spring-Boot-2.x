package org.packt.springboot22.section11.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/farm")
public class LoginFormController {
    @GetMapping("/login/guest")
    @ResponseBody
    public String loginGuest(
            @RequestParam("user") String user,
            @RequestParam("pass") String pass
    )
    {
        String message = "Welcome to FarmUp, guest " + user + "!";
        return message;
    }

    @PostMapping("/login/auth")
    @ResponseBody
    public String loginUser(@RequestParam("user") String userName, @RequestParam("pass") String password){
        String message = "Welcome guest ! " + userName;
        return message;
    }
}
