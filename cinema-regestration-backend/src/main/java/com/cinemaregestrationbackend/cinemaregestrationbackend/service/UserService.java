package com.cinemaregestrationbackend.cinemaregestrationbackend.service;

import com.cinemaregestrationbackend.cinemaregestrationbackend.dto.LoginDTO;
import com.cinemaregestrationbackend.cinemaregestrationbackend.dto.UserDTO;
import com.cinemaregestrationbackend.cinemaregestrationbackend.response.LoginResponse;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    String addUser(UserDTO userDTO);

    LoginResponse loginUser(LoginDTO loginDTO);

    boolean isUserEmailExists(String email);
}
