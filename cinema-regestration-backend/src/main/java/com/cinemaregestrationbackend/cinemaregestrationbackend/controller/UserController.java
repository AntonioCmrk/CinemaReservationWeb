package com.cinemaregestrationbackend.cinemaregestrationbackend.controller;

import com.cinemaregestrationbackend.cinemaregestrationbackend.dto.LoginDTO;
import com.cinemaregestrationbackend.cinemaregestrationbackend.dto.UserDTO;
import com.cinemaregestrationbackend.cinemaregestrationbackend.response.LoginResponse;
import com.cinemaregestrationbackend.cinemaregestrationbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(path = "/save")
    public ResponseEntity<String> saveUser(@RequestBody UserDTO userDTO) {
        String email = userDTO.getEmail();

        if (userService.isUserEmailExists(email)) {
            return ResponseEntity.badRequest().body("Email already in use");
        }

        String id = userService.addUser(userDTO);
        return ResponseEntity.ok(id);
    }

    @PostMapping(path = "/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginDTO loginDTO)
    {
        LoginResponse loginResponse = userService.loginUser(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }
}
