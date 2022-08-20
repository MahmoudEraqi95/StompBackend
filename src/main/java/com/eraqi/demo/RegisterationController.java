package com.eraqi.demo;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class RegisterationController {
    public static List<String> users = new ArrayList<String>();

    @PostMapping(value = "/register", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public Response register(@RequestBody UserBody user){
        boolean response  = users.add(user.userId);
        return new Response(response);
    }

    @GetMapping("/getUsers/{phone}")
    public List<String> getUsers(@PathVariable("phone")String phone){
        return users.stream().filter(n-> !n.equals(phone)).distinct().collect(Collectors.toList());
    }


}
