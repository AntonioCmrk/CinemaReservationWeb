package com.cinemaregestrationbackend.cinemaregestrationbackend.service.impl;

import com.cinemaregestrationbackend.cinemaregestrationbackend.dto.LoginDTO;
import com.cinemaregestrationbackend.cinemaregestrationbackend.dto.UserDTO;
import com.cinemaregestrationbackend.cinemaregestrationbackend.entity.User;
import com.cinemaregestrationbackend.cinemaregestrationbackend.repo.UserRepo;
import com.cinemaregestrationbackend.cinemaregestrationbackend.response.LoginResponse;
import com.cinemaregestrationbackend.cinemaregestrationbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserIMPL implements UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public String addUser(UserDTO userDTO) {
        User user = new User(
                userDTO.getUserid(),
                userDTO.getUsername(),
                userDTO.getEmail(),
                this.passwordEncoder.encode(userDTO.getPassword())
        );
        userRepo.save(user);
        return user.getUsername();
    }

    @Override
    public LoginResponse loginUser(LoginDTO loginDTO) {
        String msg = "";
        User user1 = userRepo.findByEmail(loginDTO.getEmail());
        if (user1 != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = user1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<User> user = userRepo.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
                if (user.isPresent()) {
                    return new LoginResponse("Login Success", true);
                } else {
                    return new LoginResponse("Login Failed", false);
                }
            } else {
                return new LoginResponse("password doesn't Match", false);
            }
        }else {
            return new LoginResponse("Email doesn't exits", false);
        }
    }

    @Override
    public boolean isUserEmailExists(String email) {
        return userRepo.existsByEmail(email);
    }
}
