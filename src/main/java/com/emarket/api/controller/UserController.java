package com.emarket.api.controller;

import com.emarket.api.converter.UserConverter;
import com.emarket.api.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.emarket.api.service.UserService;


import java.security.Principal;

@RestController
@RequestMapping("api/user")
public class UserController {
    @Autowired
    private UserConverter userConverter;

    @Autowired
    private UserService userService;

    @GetMapping("/me")
    public UserDto getUserInfo(Principal principal) {
        return userConverter.convertFromEntity(userService.findByUsername(principal.getName()));
    }
}
